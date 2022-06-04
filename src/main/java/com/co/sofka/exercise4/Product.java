package com.co.sofka.exercise4;

/**
 * clase producto que permite calcular el precio del producto
 * sumando el 20%, hace uso de la constante.
 *
 * @author CW-DV-JDAA
 * @version 01.03.003 29/05/2022
 * @since 01.
 */
public class Product {

    private static final double IVA = 0.21; //uso de la constante para calcular el precio.

    private double price;

    public Product() {
        /* metodo constructor por defecto */
    }

    /**
     * Permite actualizar el valor del atributo precio.
     *
     * @param price valor a ser almacenado.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Metodo que permite calcular el precio del
     * product con iva incluido
     *
     * @return precio con iva
     */
    public double calculatePriceWhitIVA() {
        return (price * IVA) + price;
    }
}
