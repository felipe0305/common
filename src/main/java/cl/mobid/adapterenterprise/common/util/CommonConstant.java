package cl.mobid.adapterenterprise.common.util;

public class CommonConstant {

	/*
	 * parametros requeridos para hacer peticiones HTTP desde el servicio 
	 */
	public static final String CONTENT_TYPE = "Content-Type";
	public static final String CONTENT_TYPE_JSON = "application/json;charset=UTF-8";
	
	/* 
	 * parametros de generacion class PropiedadesConfig 
	 */
	public static final String PROP_FILE_UTF8 = "UTF-8";
//	public static final String PROP_TYPE_MSG = "msg";
	public static final String PROP_TYPE_ENV = "env";
	/* 
	 * ruta de properties 
	 */
	public static final String PROPERTY_PATH = "path.property";
	public static final String PROPERTY_DIR = "properties";
	
	public static final int DEBUG_LOG = 1;
	public static final int INFO_LOG = 2;
	public static final int WARN_LOG = 3;
	public static final int ERROR_LOG = 4;
	
	
	public static final String PROPERTY_MSG_ES = "ES";
	public static final String PROPERTY_MSG_EN = "EN";
	
	public static final String ACTIVE = "1";
	public static final String INACTIVE = "0";
	
	public static final String STATUS_ENT_PUCHED = "PUSHED";
	public static final String STATUS_ENT_NOPUSHED = "NOPUSHED";
	public static final String STATUS_ENT_EXPIRED = "EXPIRED";
	public static final String STATUS_ENT_DELIVERED = "DELIVERED";
	public static final String STATUS_ENT_CONFIRMED = "CONFIRMED";
	public static final String STATUS_ENT_UNDELIVERED = "UNDELIVERED";
}
