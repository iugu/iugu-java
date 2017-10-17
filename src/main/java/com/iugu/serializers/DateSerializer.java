package com.iugu.serializers;

import java.io.IOException;
import java.lang.reflect.AnnotatedElement;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;

public class DateSerializer extends JsonSerializer<Date> implements ContextualSerializer {
	
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
	public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
		final AnnotatedElement annotated = beanProperty.getMember().getAnnotated();
		return new DateSerializer(annotated.getAnnotation(JsonFormat.class).value());
	}
}