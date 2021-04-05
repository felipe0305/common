package cl.mobid.adapterenterprise.common.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CommonFunction {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public String[] obtenerCredencialesFromHeader(List<String> listAuthorization) {
		String authorization = listAuthorization.get(0);
		String inputBase64 = authorization.split(" ")[1];
		String datos = CommonParse.parseBase64ToString(inputBase64);
		//this.logger.debug("text auth: " + datos);
		String[] credenciales = datos.split(":");
		return credenciales;
	}
	
	public boolean isJsonValid(String jsonInString) {
		try {
			if(jsonInString != null) { 
				final ObjectMapper mapper = new ObjectMapper();
				mapper.readTree(jsonInString);
				return true;
			}
			return false;
		} catch (IOException e) {
			return false;
		}
	}
	
	public StringBuilder printInputStream(InputStream is) {
		StringBuilder sb = new StringBuilder();
		String line = "";
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
			while ((line = bufferedReader.readLine()) != null) {
				line = line.trim();
				line = line.replace("\t", "");
				sb.append(line);
			}
			logger.info(sb.toString());
			bufferedReader.close();
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
		return sb;
	}
	
	public InputStream parseInputStringToUtf8(InputStream inputStream, String activeParseLatin1) throws IOException {
		InputStream inputReturn = null;

		if (CommonConstant.ACTIVE.equals(activeParseLatin1)) {
			logger.debug("transformando inputStream Latin1 a UTF-8");
			InputStreamReader isr = new InputStreamReader(inputStream, StandardCharsets.ISO_8859_1);
			BufferedReader br = new BufferedReader(isr);
			StringBuffer sb = new StringBuffer();
			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			inputReturn = new ByteArrayInputStream(sb.toString().getBytes(StandardCharsets.UTF_8));

		} else {
			logger.debug("no se realiza transformacion de inputStream");
			inputReturn = inputStream;
		}
		return inputReturn;
	}
	
	
}
