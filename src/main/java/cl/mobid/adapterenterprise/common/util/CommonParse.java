package cl.mobid.adapterenterprise.common.util;

import java.io.IOException;

import org.apache.commons.codec.binary.Base64;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CommonParse {

	private static ObjectMapper MAPPER = new ObjectMapper();
	
	public static String parseBase64ToString(String inputBase64) {
		String result;
		Base64 base64 = new Base64();
		result = new String(base64.decode(inputBase64.getBytes()));
		return result;
	}
	
	public static String ObjectToJson(Object object) throws JsonProcessingException {
		String json="";
		json = CommonParse.MAPPER.writeValueAsString(object);
		return json;
	}
	
	public static <T> T jsonToObject(String content, Class<T> valueType) throws JsonParseException, JsonMappingException, IOException {
		return (T) CommonParse.MAPPER.readValue(content, valueType);
	}
	

}
