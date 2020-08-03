package com.iugu.serializers;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author daniel
 * @date 10/09/2018
 */
public class ZonedDateTimeAdapter implements JsonSerializer<ZonedDateTime>, JsonDeserializer<ZonedDateTime> {

    @Override
    public ZonedDateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        final int localDateLength = 10;
        final String getAsString = json.getAsString();
        if (getAsString.length() == localDateLength) {
            return LocalDate.parse(getAsString).atStartOfDay(ZoneId.systemDefault());
        } else {
            return ZonedDateTime.parse(json.getAsString());
        }
    }

    @Override
    public JsonElement serialize(ZonedDateTime src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.toString());
    }
}
