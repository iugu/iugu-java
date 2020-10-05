package com.iugu.serializers;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.IOUtils;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

/**
 * @author nsd_dfelgar
 */
@Consumes({MediaType.APPLICATION_JSON, "text/json"})
@Produces({MediaType.APPLICATION_JSON, "text/json"})
public class IuguGsonJsonProvider implements MessageBodyReader<Object>, MessageBodyWriter<Object> {

    private Gson gson;

    private Gson getGson() {
        if (gson == null) {
            final GsonBuilder gsonBuilder = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .registerTypeAdapter(ZonedDateTime.class, new ZonedDateTimeAdapter())
                    .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                    .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter());

            gson = gsonBuilder.create();
        }
        return gson;
    }

    @Override
    public boolean isReadable(Class<?> type, Type genericType, java.lang.annotation.Annotation[] annotations,
                              MediaType mediaType) {
        return true;
    }

    @Override
    public Object readFrom(Class<Object> type, Type genericType, Annotation[] annotations, MediaType mediaType,
                           MultivaluedMap<String, String> httpHeaders, InputStream entityStream) throws IOException {
        Type jsonType;
        if (type.equals(genericType)) {
            jsonType = type;
        } else {
            jsonType = genericType;
        }
        String json = IOUtils.toString(entityStream, StandardCharsets.UTF_8.name());
        return getGson().fromJson(json, jsonType);
    }

    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return true;
    }

    @Override
    public long getSize(Object object, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return -1;
    }

    @Override
    public void writeTo(Object object, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType,
                        MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException {
        try (OutputStreamWriter writer = new OutputStreamWriter(entityStream, StandardCharsets.UTF_8)) {
            Type jsonType;
            if (type.equals(genericType)) {
                jsonType = type;
            } else {
                jsonType = genericType;
            }
            Gson gson = getGson();
            gson.toJson(object, jsonType, writer);
        }
    }
}

