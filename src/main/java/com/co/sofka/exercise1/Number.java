package com.co.sofka.exercise1;

/**
 * Clase numero la cual almacena los dos numeros, y realiza
 * la validacion e implemente los metodos set de dichos atributos.
 *
 * @author CW-DV-JDAA
 * @version 01.03.003 29/05/2022
 * @since 01.
 */
public class Number {
    private double number1;
    private double number2;

    /**
     * Metodo constructor por defecto.
     */
    public Number() {
        /* constructor por defecto */
    }

    /**
     * Actualiza el valor del atributo number1.
     *
     * @param number1 valor a almacenar.
     */
    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    /**
     * Actualiza el valor del atributo number2.
     *
     * @param number2 valor a almacenar.
     */
    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    /**
     * Metodo que permite realizar la comparacion entre numeros
     * y retormar el mensaje que corresponda.
     *
     * @return mensaje segun corresponda
     */
    public String validationNumber() {
        if (number1 > number2) {
            return number1 + " es mayor que " + number2;
        } else if (number2 > number1) {
            return number2 + " es mayor que " + number1;
        }
        return number1 + " es igual " + number2;
    }
}
