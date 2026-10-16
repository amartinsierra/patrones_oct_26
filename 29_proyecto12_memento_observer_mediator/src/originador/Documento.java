package originador;

import java.util.ArrayList;
import java.util.List;

import observer.Observador;

public class Documento   {
    private String contenido = "";
    private List<Observador> observadores = new ArrayList<>();

    public void escribir(String texto) {
        contenido += texto;
        
    }

   

    public String getContenido() {
        return contenido;
    }

    

    
}

