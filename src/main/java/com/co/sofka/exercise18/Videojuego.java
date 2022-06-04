package com.co.sofka.exercise18;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Clase Video Juego que implementa la interfaz IEntregable.
 * y sus metodos, los cuales son implementados.
 *
 * @author CW-DV-JDAA
 * @version 01.03.003 29/05/2022
 * @since 01.
 */
public class Videojuego implements IEntregable {

    private static final int HOURS_ESTIMATION = 10;
    private static final boolean DELIVER_DEFAULT = false;

    private String tittle;
    private int hoursEstimation;

    /*
     * Variable usada para determinar si fue entregado
     * o no el videoJuego.
     */
    private boolean deliver;
    private String type;
    private String company;

    public Videojuego() {
        hoursEstimation = HOURS_ESTIMATION;
        deliver = DELIVER_DEFAULT;
    }

    public Videojuego(String tittle, int hoursEstimation) {
        this.tittle = tittle;
        this.hoursEstimation = hoursEstimation;
        deliver = DELIVER_DEFAULT;
    }

    public Videojuego(String tittle, int hoursEstimation, String type, String company) {
        this.tittle = tittle;
        this.hoursEstimation = hoursEstimation;
        this.type = type;
        this.company = company;
        deliver = DELIVER_DEFAULT;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getHoursEstimation() {
        return hoursEstimation;
    }

    public void setHoursEstimation(int hoursEstimation) {
        this.hoursEstimation = hoursEstimation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    @Override
    public String toString() {
        return "Videojuego{" +
               "tittle='" + tittle + '\'' +
               ", hoursEstimation=" + hoursEstimation +
               ", deliver=" + deliver +
               ", type='" + type + '\'' +
               ", company='" + company + '\'' +
               '}';
    }

    /**
     * Sobre escribimos el metodo Enunciado en la
     * interfaz la cual estamos implementando.
     */
    @Override
    public void deliver() {
        deliver = true;
    }

    /**
     * Sobre escribimos el metodo Enunciado en la
     * interfaz la cual estamos implementando.
     */
    @Override
    public void unDelivered() {
        deliver = false;
    }

    /**
     * Sobre escribimos el metodo Enunciado en la
     * interfaz la cual estamos implementando.
     */
    @Override
    public boolean isDelivered() {
        return deliver;
    }

    /**
     * Sobre escribimos el metodo Enunciado en la
     * interfaz la cual estamos implementando.
     */
    @Override
    public Object compareTo(Object obj) {
        List<Videojuego> listVideo = (List<Videojuego>) obj;

        return Collections.max(listVideo, Comparator.comparing(Videojuego::getHoursEstimation));
    }
}
