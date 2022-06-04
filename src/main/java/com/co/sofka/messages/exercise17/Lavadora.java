package com.co.sofka.messages.exercise17;

/**
 * Clase Lavadora, la cual tiene atributos
 * que seran heradados de la clase Electrodomestico
 *
 * @author CW-DV-JDAA
 * @version 02.03.003 29/05/2022
 * @since 01.
 */
public class Lavadora extends Electrodomestico {

    private static final double LOADDEFAULT = 5;

    private double maximumLoad;


    public Lavadora() {
        super();
    }

    /**
     * Constructor que solo recibe precio y peso.
     *
     * @param price  precio de la lavadora
     * @param weight peso de la lavadora
     */
    public Lavadora(double price, double weight) {
        super();
        this.priceBase = price;
        this.weight = weight;
        maximumLoad = LOADDEFAULT;
    }

    /**
     * Constructor que nos permite instanciar e inicializar los atributos
     * por defecto usamos la LOADDEFAULT para la cargamaxima.
     *
     * @param price             precio de la lavadora
     * @param color             color de la lavadora
     * @param consumptionEnergy consumo de energia
     * @param weight            peso de la lavadora
     * @param maximumLoad       carga maxima.
     */
    public Lavadora(double price, String color, char consumptionEnergy, double weight,
                    double maximumLoad) {
        super(price, color, consumptionEnergy, weight);
        this.maximumLoad = maximumLoad;
    }

    public double getMaximumLoad() {
        return maximumLoad;
    }

    public void setMaximumLoad(double maximumLoad) {
        this.maximumLoad = maximumLoad;
    }

    /**
     * Sobreescribimos el metodo calculatePriceFinalWeight,
     * ya que la clase Lavadora tiene condiciones especificas ademas
     * de las condiciones del clase padre.
     */
    @Override
    public void calculatePriceFinalWeight() {
        super.calculatePriceFinalWeight();
        if (getWeight() > 30) {
            setPriceBase(getPriceBase() + 50);
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
        return "Lavadora{" +
               "priceBase=" + priceBase +
               ", color='" + color + '\'' +
               ", consumptionEnergy=" + consumptionEnergy +
               ", weight=" + weight +
               '}';
    }

}
