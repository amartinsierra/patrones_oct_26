package com.patrones.comportamiento.tienda.service;

import com.patrones.comportamiento.tienda.model.Pedido;
import com.patrones.comportamiento.tienda.strategy.EstrategiaDescuento;

public class PedidosService {
    private EstrategiaDescuento estrategia;

    public PedidosService(EstrategiaDescuento estrategia) {
        this.estrategia = estrategia;
    }
    public void procesarPedido(Pedido pedido) {
		
        

	}
    
}
