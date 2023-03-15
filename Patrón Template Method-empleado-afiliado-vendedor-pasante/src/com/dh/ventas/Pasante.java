package com.dh.ventas;

public class Pasante extends Vendedor{
    public Pasante(String nombre) {
        super.nombre = nombre;
        super.PUNTOS_POR_VENTA = 5;
    }

    @Override
    public int calcularPuntos() {
        return super.ventas*super.PUNTOS_POR_VENTA;
    }

    @Override
    public String getNombreCategoria() {
        int puntosVendedor = calcularPuntos();
        if(puntosVendedor < 50){
            return "novato";
        }
        else{
            return "pasante experimentado";
        }
    }
}
