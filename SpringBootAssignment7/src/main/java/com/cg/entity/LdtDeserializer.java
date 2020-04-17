package com.cg.entity;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
//converts string in to local date
public class LdtDeserializer extends StdDeserializer<LocalDate>{

	public LdtDeserializer() {
		super(LocalDate.class);
		
	}

	@Override
	public LocalDate deserialize(JsonParser parser, DeserializationContext arg1)
			throws IOException, JsonProcessingException {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-M-d");
		return LocalDate.parse(parser.readValueAs(String.class), df);
		
	}

}
