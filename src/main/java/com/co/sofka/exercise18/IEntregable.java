package com.co.sofka.exercise18;

/**
 * Interfaz que enuncia los metodos que deben implemntar
 * la clase que extienda de ella.
 *
 * @author CW-DV-JDAA
 * @version 01.03.003 29/05/2022
 * @since 01.
 */
public interface IEntregable {

    /**
     * Metodo cambia el atributo prestado a true
     */
    void deliver();

    /**
     * Metodo que entrega un elemento
     * cambiando su estado.
     */
    void unDelivered();

    /**
     * devuelve el estado del atributo
     */
    boolean isDelivered();

    /**
     * Permite comparar dos elementos.
     *
     * @param obj Objeto a comparar
     * @return Object
     */
    Object compareTo(Object obj);
}
