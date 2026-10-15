package com.patrones.estructurales.streaming.buena.proxy;

import com.patrones.estructurales.streaming.buena.composite.ComponenteReproducible;
import com.patrones.estructurales.streaming.buena.composite.Pelicula;

public class ProxyPelicula implements ComponenteReproducible {
    private ComponenteReproducible componente;
    private boolean premium;

    public ProxyPelicula(ComponenteReproducible componente, boolean premium) {
        this.componente = componente;
        this.premium = premium;
    }

    @Override
    public void reproducir() {
        if (!premium) {
            System.out.println("Acceso denegado: necesitas cuenta premium.");
        } else {
        	componente.reproducir();
        }
    }
}

