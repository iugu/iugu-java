package com.iugu.serializers;

import java.io.IOException;
import java.lang.reflect.AnnotatedElement;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.ContextualSerializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.SerializerProvider;

public class DateSerializer extends JsonSerializer<Date> implements ContextualSerializer<Date> {
	
	private final String format;

	private DateSerializer(final String format) {
		this.format = format;
	}

	public DateSerializer() {
		this.format = null;
	}

	@Override
	public void serialize(final Date value, final JsonGenerator jgen, final SerializerProvider provider) throws IOException {
		jgen.writeString(new SimpleDateFormat(format).format(value));
	}

	@Override
	public JsonSerializer<Date> createContextual(final SerializationConfig serializationConfig, final BeanProperty beanProperty) throws JsonMappingException {
		final AnnotatedElement annotated = beanProperty.getMember().getAnnotated();
		return new DateSerializer(annotated.getAnnotation(JsonFormat.class).value());
	}
	
}