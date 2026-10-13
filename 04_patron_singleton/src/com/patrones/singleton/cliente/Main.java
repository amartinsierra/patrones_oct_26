package com.patrones.singleton.cliente;

import com.patrones.singleton.service.LoggerSingleton;
import com.patrones.singleton.service.moderna.LoggerSingletonEnum;

public class Main {

	public static void main(String[] args) {
		/*LoggerSingleton l1=LoggerSingleton.getInstance();
		LoggerSingleton l2=LoggerSingleton.getInstance();
		System.out.println(l1==l2);*/
		var l1=LoggerSingletonEnum.INSTANCE;
		var l2=LoggerSingletonEnum.INSTANCE;
		System.out.println(l1==l2);
	}

}
