package cl.mobid.adapterenterprise.common.service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import cl.mobid.adapterenterprise.common.util.CommonConstant;

public abstract class CommonClientServiceBasicAuth {
	private String URL;
	private String USER;
	private String PASS;

	public CommonClientServiceBasicAuth(String url, String user, String pass) {
		this.URL = url;
		this.USER = user;
		this.PASS = pass;
	}

	protected void formatLogClient(String text, int type, Exception e) {
		System.out.println(text);
	}
	
	protected String post(String body) throws JsonParseException, JsonMappingException, IOException {
		String jsonText=null;
		try {
			formatLogClient(body, CommonConstant.INFO_LOG, null);
			HttpClient httpClient = HttpClientBuilder.create().build();
			StringEntity entity = new StringEntity(body, StandardCharsets.UTF_8);
			entity.setChunked(true);
			HttpPost request = new HttpPost(this.URL);
			if(this.USER !=null&& this.USER.length()>0 && this.PASS !=null && this.PASS.length()>0) {
				String auth = this.USER + ":" + this.PASS;
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(StandardCharsets.UTF_8));
				String authHeader = "Basic " + new String(encodedAuth);
				request.setHeader(HttpHeaders.AUTHORIZATION, authHeader);
			}
			request.setEntity(entity);
			request.addHeader(CommonConstant.CONTENT_TYPE, CommonConstant.CONTENT_TYPE_JSON);
			HttpResponse response = httpClient.execute(request);
			jsonText = EntityUtils.toString(response.getEntity());
			formatLogClient(jsonText, CommonConstant.INFO_LOG, null);
		} catch (Exception e) {
			formatLogClient(jsonText, CommonConstant.ERROR_LOG, e);
		}
		
		
		return jsonText;
		
	}
}
