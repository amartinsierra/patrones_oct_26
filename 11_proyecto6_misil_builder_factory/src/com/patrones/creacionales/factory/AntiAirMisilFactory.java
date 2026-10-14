package com.patrones.creacionales.factory;

import com.patrones.creacionales.builder.Misil;
import com.patrones.creacionales.builder.MisilBuilder;

public class AntiAirMisilFactory extends MisilFactory {
    public Misil createMisil() {
        return new MisilBuilder()
               .buildGuiado("Radar activo")
               .buildOjiva("Fragmentación")
               .buildPropulsion("Combustible sólido")
               .buildAlcance(120)
               .buildTipo("Antiaereo")
               .getMisil();
    }
}

