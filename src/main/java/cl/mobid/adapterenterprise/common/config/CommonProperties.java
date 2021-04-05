package cl.mobid.adapterenterprise.common.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import cl.mobid.adapterenterprise.common.util.CommonConstant;

public abstract class CommonProperties {

	private Properties PROPERTY_MSG_ES;
//	private Properties PROPERTY_MSG_EN;
	private String path;
	
	
	protected void formatLog(String message, int typeLog, Exception e) {
		System.out.println(message);
		if(typeLog==CommonConstant.ERROR_LOG) {
			e.printStackTrace();
		}
	}
	
	protected CommonProperties(String path) {
		formatLog("path: "+path, CommonConstant.INFO_LOG, null);
		this.path = path;
		loadProperties();
	}

	private void loadProperties() {
		PROPERTY_MSG_ES = new Properties();
//		PROPERTY_MSG_EN = new Properties();
		String filename = "";
		try {
			Reader reader=null;
			
			filename = "msg.properties";
			reader = crearReaderProperty(filename);
			if(reader!=null) {
				PROPERTY_MSG_ES.load(reader);
				formatLog("se carga archivo properties "+this.path+"/"+filename, CommonConstant.INFO_LOG, null);
			}
			
//			filename = "msg_en.properties";
//			reader = crearReaderProperty(filename);
//			if(reader!=null) {
//				PROPERTY_MSG_ES.load(reader);
//				formatLog("se carga archivo properties "+this.path+"/"+filename, CommonConstant.INFO_LOG, null);
//			}
		} catch (IOException e) {
			formatLog(e.getMessage(), CommonConstant.ERROR_LOG, e);
		}
	}

	private Reader crearReaderProperty(String filename) {
		FileInputStream fis;
		Reader reader=null;
		try {
			File file = new File(this.path+"/"+filename);
			if(file.exists()) {
				fis = new FileInputStream(file);
				reader = new InputStreamReader(fis, CommonConstant.PROP_FILE_UTF8);
			}
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			formatLog(e.getMessage(), CommonConstant.ERROR_LOG, e);
		}
		return reader;
	}

	public String getPropiedadType(String key, String type) {
		String text;
		switch (type) {
		case CommonConstant.PROPERTY_MSG_ES:
			text = PROPERTY_MSG_ES.getProperty(key);
			break;
//		case CommonConstant.PROPERTY_MSG_EN:
//			text = PROPERTY_MSG_EN.getProperty(key);
//			break;
		default:
			text = PROPERTY_MSG_ES.getProperty(key);
			break;
		}
		return text;
	}
}
