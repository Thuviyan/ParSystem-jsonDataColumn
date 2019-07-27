package com.sgic.parsystem.converter;

import java.io.IOException;
import java.util.List;


import javax.persistence.AttributeConverter;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AppraisorConvertor implements AttributeConverter<List<String>, String> {
	 
    @Override
    public String convertToDatabaseColumn(List<String> appraisorString) {
 
        String appraisorJson = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
        	appraisorJson = objectMapper.writeValueAsString(appraisorString);
        } catch (final JsonProcessingException e) {
            System.out.println("JSON writing error");
        }
 
        return appraisorJson;
    }
 
    @Override
    public List<String> convertToEntityAttribute(String appraisorJson) {
 
        List<String> appraisorString = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
        	appraisorString = objectMapper.readValue(appraisorJson, List.class);
        } catch (final IOException e) {
        	System.out.println("JSON writing error");
        }
 
        return appraisorString;
    }
 
}