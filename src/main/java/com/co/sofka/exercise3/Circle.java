package com.co.sofka.exercise3;

/**
 * Clase circulo la cual tiene como objetivo calcular
 * el area del ciruclo hace uso de la constante PI
 *
 * @author CW-DV-JDAA
 * @version 01.03.003 29/05/2022
 * @since 01.
 */
public class Circle {

    /**
     * Constructor para poder instanciar la clase
     */
    public Circle() {
        //metodo vacio para inicializar la clase
    }

    /**
     * Metodo qeu calcula el area del circulo
     *
     * @param radio valor del radio
     * @return el valor del area del circulo.
     */
    public double calculateArea(double radio) {
        final double valuePI = Math.PI;
        return valuePI * Math.pow(radio, 2);
    }

}
