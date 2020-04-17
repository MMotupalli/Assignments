package com.cg.entity;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

//converts LocalDate in to String
public class LDTSerializer extends StdSerializer<LocalDate>{
   
	public LDTSerializer() {
        super(LocalDate.class);
    }
	
	@Override
	public void serialize(LocalDate ldt, JsonGenerator generator, 
			SerializerProvider arg2) throws IOException {
		
		 generator.writeString(ldt.toString());
	}

}
