package com.patrones.prototype.model;

import java.util.ArrayList;

public class Libro implements Cloneable{
    private String titulo;
    private String isbn;
    private ArrayList<String> autor;
    public Libro(String titulo, String isbn, ArrayList<String> autor) {
        super();
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }
    //getter setter
    
    @Override 
    public Libro clone() {
        try {
            //llamada al método clone() heredado de Object
            return (Libro)super.clone();
        }catch(CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
    public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public ArrayList<String> getAutor() {
		return autor;
	}

	public void setAutor(ArrayList<String> autor) {
		this.autor = autor;
	}

	@Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + "]";
    }   
}

