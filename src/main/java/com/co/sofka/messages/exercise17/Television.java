package com.co.sofka.messages.exercise17;

/**
 * Clase Televisión extiende de la super clase Electrodomestico
 *
 * @author CW-DV-JDAA
 * @version 02.03.003 29/05/2022
 * @since 01.
 */
public class Television extends Electrodomestico {

    private static final double RESOLUTIONDEFOULT = 20;
    private static final boolean TUNERTDTDEFOULT = false;

    private double resolution;
    private boolean tunerTDT;


    public Television() {
        super();
        resolution = RESOLUTIONDEFOULT;
        tunerTDT = TUNERTDTDEFOULT;
    }

    /**
     * Constructor con solo el peso y el precio.
     *
     * @param price  precio del electrodomestico
     * @param weight peso del electrodomestico
     */
    public Television(double price, double weight) {
        super();
        this.weight = weight;
        this.priceBase = price;
        resolution = RESOLUTIONDEFOULT;
        tunerTDT = TUNERTDTDEFOULT;
    }

    /**
     * Constructor con los atributos hereados, de la clase Electrodomestico.
     *
     * @param price             precio del Electrodomestico
     * @param color             color del Electrodomestico
     * @param consumptionEnergy consumo energia del Electrodomestico
     * @param weight            peso del Electrodomestico
     * @param resolution        resolucion del Electrodomestico
     * @param tunerTDT          TDT del Electrodomestico
     */
    public Television(double price, String color, char consumptionEnergy, double weight,
                      double resolution, boolean tunerTDT) {
        super(price, color, consumptionEnergy, weight);
        this.resolution = resolution;
        this.tunerTDT = tunerTDT;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    public boolean isTunerTDT() {
        return tunerTDT;
    }

    public void setTunerTDT(boolean tunerTDT) {
        this.tunerTDT = tunerTDT;
    }

    /**
     * Sobreescribimos el metodo calculatePriceFinalWeight,
     * ya que la clase Lavadora tiene condiciones especificas ademas
     * de las condiciones del clase padre.
     */
    @Override
    public void calculatePriceFinalWeight() {
        super.calculatePriceFinalWeight();

        if (getResolution() > 40) {
            setPriceBase(getPriceBase() + (getPriceBase() * 0.3));
        } else if (tunerTDT) {
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
        return "Television{" +
               "priceBase=" + priceBase +
               ", color='" + color + '\'' +
               ", consumptionEnergy=" + consumptionEnergy +
               ", weight=" + weight +
               '}';
    }
}
