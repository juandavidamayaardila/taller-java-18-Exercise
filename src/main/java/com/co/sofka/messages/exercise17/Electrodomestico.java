package com.co.sofka.messages.exercise17;

import java.util.ArrayList;
import java.util.List;

/**
 * Super clase Electrodomesticos, la cual tiene atributos
 * que seran heradados por las clases que la extiendan.
 *
 * @author CW-DV-JDAA
 * @version 02.03.003 29/05/2022
 * @since 01.
 */
public abstract class Electrodomestico {
    private static final String COLOR_BASE = "Blanco";
    private static final char CONSUMPTION_ENERGY = 'F';
    private static final double PRICE_BASE = 100;
    private static final double WEIGHT_BASE = 5;
    private final List<String> listColor = new ArrayList<>();

    protected double priceBase;
    protected String color;
    protected char consumptionEnergy;
    protected double weight;

    protected Electrodomestico() {
        loadColorAvailable();
    }

    protected Electrodomestico(double price, double weight) {
        this.priceBase = price;
        this.weight = weight;
        color = COLOR_BASE;
        consumptionEnergy = CONSUMPTION_ENERGY;
        calculatePriceFinalConsumptionEnergy();
        loadColorAvailable();
    }

    /**
     * Metodo constructor que permite inicializar las variables
     * usamos los metodos para validar la consumo de energia,
     * precio y iniciamos la lista de colores abilitados.
     *
     * @param price             precio del electrodomestico.
     * @param color             color del electrodomestico.
     * @param consumptionEnergy cosumo del electrodomestico.
     * @param weight            peso del electrodomestico.
     */
    protected Electrodomestico(double price, String color, char consumptionEnergy, double weight) {
        this.priceBase = price;
        this.weight = weight;
        calculatePriceFinalConsumptionEnergy();
        validateConsumptionEnergy(consumptionEnergy);
        validateColor(color);
    }

    public double getPriceBase() {
        return priceBase;
    }

    public void setPriceBase(double priceBase) {
        this.priceBase = priceBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumptionEnergy() {
        return consumptionEnergy;
    }

    public void setConsumptionEnergy(char consumptionEnergy) {
        this.consumptionEnergy = consumptionEnergy;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Metodo privado usado para validar si la letra ingresada como
     * consumo es valida. si no lo es usamos el valor por defecto.
     *
     * @param letter letra ingresada por el usuario
     */
    private void validateConsumptionEnergy(char letter) {
        if (letter == 'A' || letter == 'B' || letter == 'C' || letter == 'D' ||
            letter == 'E' || letter == 'F') {

            this.consumptionEnergy = letter;
        } else {
            this.consumptionEnergy = CONSUMPTION_ENERGY;
        }

    }

    /**
     * Validamos si el color ingresado por el usuario es valido
     * de no ser asi, usamos el valor por defecto.
     *
     * @param color color ingresado por el usuario
     */
    private void validateColor(String color) {
        if (listColor.contains(color)) {
            this.color = color;
        } else {
            this.color = COLOR_BASE;
        }
    }

    /**
     * Iniciamos una lista de colores disponibles.
     */
    private void loadColorAvailable() {
        listColor.add("blanco");
        listColor.add("negro");
        listColor.add("rojo");
        listColor.add("azul");
        listColor.add("gris");

    }

    /**
     * Calculamos el precio final del Electrodomestico segun las
     * condiciones del peso, y almacenamos el valor
     * usando los metodos set.
     */
    public void calculatePriceFinalWeight() {
        double weightTmp = getWeight();
        if (weightTmp >= 0 && weightTmp <= 19) {
            setPriceBase(getPriceBase() + 10);
        } else if (weightTmp >= 20 && weightTmp <= 49) {
            setPriceBase(getPriceBase() + 50);
        } else if (weightTmp >= 50 && weightTmp <= 79) {
            setPriceBase(getPriceBase() + 80);
        } else {
            setPriceBase(getPriceBase() + 100);
        }
    }

    /**
     * Calculamos el precio final del Electrodomestico segun las
     * condiciones del consumo de energia, y almacenamos el valor
     * usando los metodos set.
     */
    public void calculatePriceFinalConsumptionEnergy() {
        char letter = getConsumptionEnergy();
        switch (letter) {
            case 'A', 'a' -> setPriceBase(getPriceBase() + 100);
            case 'B', 'b' -> setPriceBase(getPriceBase() + 80);
            case 'C', 'c' -> setPriceBase(getPriceBase() + 60);
            case 'D', 'd' -> setPriceBase(getPriceBase() + 50);
            case 'E', 'e' -> setPriceBase(getPriceBase() + 20);
            default -> setPriceBase(getPriceBase() + 10);
        }
    }

    /**
     * Sobreescribimos el metodo toString para mostrar la información
     * del producto.
     *
     * @return cadena con toda la informacion del objeto.
     */
    @Override
    public String toString() {
        return "Electrodomestico{" +
               "COLOR_BASE='" + COLOR_BASE + '\'' +
               ", CONSUMPTION_ENERGIy=" + CONSUMPTION_ENERGY +
               ", PRICE_BASE=" + PRICE_BASE +
               ", WEIGHT_BASE=" + WEIGHT_BASE +
               ", listColor=" + listColor +
               ", priceBase=" + priceBase +
               ", color='" + color + '\'' +
               ", consumptionEnergy=" + consumptionEnergy +
               ", weight=" + weight +
               '}';
    }
}
