package com.patrones.singleton.service.moderna;

public enum LoggerSingletonEnum {
	INSTANCE; //se crea una única instancia de forma segura, garantizado por la JVM
	public void log(String msg) {
		System.out.println("[LOG] " + msg);
	}
}
