package cl.mobid.adapterenterprise.common.service;

import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import cl.mobid.adapterenterprise.common.util.CommonConstant;

public abstract class CommonClientEnterpriseService {
	
	private String URL;
	private String USER;
	private String PASS;

	public CommonClientEnterpriseService(String url, String user, String pass) {
		this.URL = url;
		this.USER = user;
		this.PASS = pass;
	}

	protected abstract void formatLog(String text, int type, Exception e);
	
	protected String callPost(String body) {
		String jsonText = null;
		try {
			formatLog(body, CommonConstant.DEBUG_LOG, null);
			
			HttpClient httpClient = HttpClientBuilder.create().build();
			StringEntity entity = new StringEntity(body, StandardCharsets.UTF_8);
			entity.setChunked(true);
			HttpPost request = new HttpPost(this.URL);
			if(this.USER !=null&& this.USER.length()>0 && this.PASS !=null && this.PASS.length()>0) {
				String auth = this.USER + ":" + this.PASS;
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(StandardCharsets.UTF_8));
				String authHeader = "Basic " + new String(encodedAuth);
				formatLog("Agregando basic auth.", CommonConstant.DEBUG_LOG, null);
				request.setHeader(HttpHeaders.AUTHORIZATION, authHeader);
			}
			request.setEntity(entity);
			
			formatLog("Agregando header json.", CommonConstant.DEBUG_LOG, null);
			request.addHeader(CommonConstant.CONTENT_TYPE, CommonConstant.CONTENT_TYPE_JSON);
			
			formatLog(String.format("Invocando a servicio con url %s: ",this.URL), CommonConstant.DEBUG_LOG, null);
			HttpResponse response = httpClient.execute(request);
			
			jsonText = EntityUtils.toString(response.getEntity());
			formatLog(jsonText, CommonConstant.DEBUG_LOG, null);
		} catch (Exception e) {
			formatLog(e.getMessage(), CommonConstant.ERROR_LOG, e);
		}
		return jsonText;
	}
	
	protected String callGet() {
		String jsonText = null;
		try {
			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(this.URL);
			if(this.USER !=null&& this.USER.length()>0 && this.PASS !=null && this.PASS.length()>0) {
				String auth = this.USER + ":" + this.PASS;
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(StandardCharsets.UTF_8));
				String authHeader = "Basic " + new String(encodedAuth);
				
				formatLog("Agregando basic auth.", CommonConstant.DEBUG_LOG, null);
				request.setHeader(HttpHeaders.AUTHORIZATION, authHeader);
			}
			formatLog("Agregando header json.", CommonConstant.DEBUG_LOG, null);
			request.addHeader(CommonConstant.CONTENT_TYPE, CommonConstant.CONTENT_TYPE_JSON);
			
			formatLog(String.format("Invocando a servicio con url %s: ",this.URL), CommonConstant.DEBUG_LOG, null);
			HttpResponse response = httpClient.execute(request);
			
			jsonText = EntityUtils.toString(response.getEntity());
			formatLog(jsonText, CommonConstant.DEBUG_LOG, null);
		} catch (Exception e) {
			formatLog(e.getMessage(), CommonConstant.ERROR_LOG, e);
		}
		return jsonText;
		
	}
}
