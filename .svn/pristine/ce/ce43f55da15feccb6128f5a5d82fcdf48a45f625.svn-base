package com.fast.common.jsonext;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;


/**
 *  此注解用于属性或者setter方法上，用于在反序列化时可以嵌入我们自定义的代码
 * 
 * */
public class CustomDateDeserialize extends JsonDeserializer<Date> {
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
	  
    @Override  
    public Date deserialize(JsonParser jp, DeserializationContext ctxt)  
            throws IOException, JsonProcessingException {  
  
        Date date = null;  
        try {  
            date = sdf.parse(jp.getText());  
        } catch (ParseException e) {  
            e.printStackTrace();  
        }  
        return date;  
    }  
}
