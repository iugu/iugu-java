package com.iugu.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateSerializer extends JsonSerializer<Date> {
	
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

	/*public JsonSerializer<Date> createContextual(final SerializationConfig serializationConfig, final BeanProperty beanProperty) throws JsonMappingException {
		final AnnotatedElement annotated = beanProperty.getMember().getAnnotated();
		return new DateSerializer(annotated.getAnnotation(JsonFormat.class).value());
	}*/
}