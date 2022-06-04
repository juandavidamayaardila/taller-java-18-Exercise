package com.co.sofka.exercise18;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Clase Series que implementa la interfaz IEntregable.
 * y sus metodos, los cuales son implementados.
 *
 * @author CW-DV-JDAA
 * @version 01.03.003 29/05/2022
 * @since 01.
 */
public class Series implements IEntregable {

    private static final int NUMBER_SEASON = 3;
    private static final boolean DELIVER_DEFAULT = false;

    private String tittle;
    private int numberSeason;
    private boolean deliver;
    private String type;
    private String creator;

    public Series() {
        numberSeason = NUMBER_SEASON;
        deliver = DELIVER_DEFAULT;
    }

    public Series(String tittle, int numberSeason, String type, String creator) {
        this.tittle = tittle;
        this.numberSeason = numberSeason;
        this.type = type;
        this.creator = creator;
        deliver = DELIVER_DEFAULT;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getNumberSeason() {
        return numberSeason;
    }

    public void setNumberSeason(int numberSeason) {
        this.numberSeason = numberSeason;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Series{" +
               "tittle='" + tittle + '\'' +
               ", numberSeason=" + numberSeason +
               ", deliver=" + deliver +
               ", type='" + type + '\'' +
               ", creator='" + creator + '\'' +
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
        List<Series> listSerie = (List<Series>) obj;

        return Collections.max(listSerie, Comparator.comparing(Series::getNumberSeason));
    }
}
