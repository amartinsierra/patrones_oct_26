package com.patrones.prototype.cliente;

import java.util.ArrayList;
import java.util.List;

import com.patrones.prototype.model.Libro;

public class Demo {

	public static void main(String[] args) {
		Libro prototipo=new Libro("El quijote","a1121212",new ArrayList<>(List.of("cervantes","manuel")));
		Libro l1=prototipo.clone();
		Libro l2=prototipo.clone();
		l2.getAutor().add("tercero");
		System.out.println(l1);
		System.out.println(l2);
	}

}
