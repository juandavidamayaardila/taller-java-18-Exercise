package com.co.sofka.exercise8;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase laboral tiene como atributo dia el cual almacena
 * y compara para determinar si es un dia laboral o no.
 *
 * @author CW-DV-JDAA
 * @version 01.03.003 29/05/2022
 * @since 01.
 */
public class Laboral {

    private String dia;

    public Laboral() {
        /* Meotdo constructor por defecto */
    }

    /**
     * Permite actualizar el valor del atributo dia.
     *
     * @param dia valor a ser almancendo.
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * Permite validar si el dia ingresado es laboral
     * o no.
     *
     * @return true si es laboral; false si no lo es.
     */
    public boolean validatorDayWeek() {

        return switch (dia.toUpperCase()) {
            case "SABADO", "DOMINGO" -> false;
            default -> true;
        };
    }

    /**
     * Valida que el dia ingresado sea un dia valido.
     * se encuentre en la lista.
     *
     * @param dia
     * @return
     */
    public boolean validatorNameDay(String dia) {
        List<String> listDay = new ArrayList<>();
        listDay.add("LUNES");
        listDay.add("MARTES");
        listDay.add("MIERCOLES");
        listDay.add("JUEVES");
        listDay.add("VIERNES");
        listDay.add("SABADO");
        listDay.add("DOMINGO");

        return listDay.contains(dia.toUpperCase());

    }
}
