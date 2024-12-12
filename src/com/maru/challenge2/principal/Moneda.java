package com.maru.challenge2.principal;

import com.maru.challenge2.conversor.CambioDeMoneda;

public class Moneda{
    
    private String monedaBase;
    private String monedaDeCambio;
    public int valorIngresado;
    private Float resultado;

    public Moneda(CambioDeMoneda cambioDeMoneda, int valorIngresado) {
        this.monedaBase = cambioDeMoneda.base_code();
        this.monedaDeCambio = cambioDeMoneda.target_code();
        this.resultado = cambioDeMoneda.conversion_result();
        this.valorIngresado = valorIngresado;
    }

    public int getValorIngresado() {
        return valorIngresado;
    }

    public String getMonedaBase() {
        return monedaBase;
    }
    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public String getMonedaDeCambio() {
        return monedaDeCambio;
    }

    public void setMonedaDeCambio(String monedaDeCambio) {
        this.monedaDeCambio = monedaDeCambio;
    }

    public Float getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        return "\nLa conversión de "+getValorIngresado()+"["+monedaBase+"] es de "+resultado+"["+getMonedaDeCambio()+"]";
    }
}
