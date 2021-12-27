package com.bookmyaction.tickettakie.config;


public class RequestCorrelation {

	public static final String CORRELATION_ID = "X-Request-ID";
	public static final String SESSION_ID = "sessionId";
	
	public static final String AUTH_HEADER_NAME = "X-AUTH-TOKEN";

	private static final ThreadLocal<String> id = new ThreadLocal<String>();
	private static final ThreadLocal<String> sessionId = new ThreadLocal<String>();

	public static String getId() {
		return id.get();
	}

	public static void setId(String correlationId) {
		id.set(correlationId);
	}

	public static ThreadLocal<String> getSessionId() {
		return sessionId;
	}
	
	
	public static void setSessionId(String correlationId) {
		sessionId.set(correlationId);
	}
	
}