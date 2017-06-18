package com.fast.common.jsonext;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;


/*
 * date类型转换为json字符串时,spring使用jackson转换json字符
 *  http://blog.csdn.net/zhanngle/article/details/24123659
 * */
public class JsonDateSerializer extends JsonSerializer<Date> {
	private SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");  
	@Override
	public void serialize(Date date, JsonGenerator gen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		String value = dateFormat.format(date);  
	       gen.writeString(value);  
		
	}

}
