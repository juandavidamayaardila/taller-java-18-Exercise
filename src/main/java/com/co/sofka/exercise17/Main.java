package com.co.sofka.exercise17;

import com.co.sofka.messages.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Main que permite inicializar la aplicación.
 *
 * @author CW-DV-JDAA
 * @version 02.03.003 29/05/2022
 * @since 01.
 */
public class Main {
    /**
     * Instancia de la clase encargada de mostrar los mensajes
     */
    static Message messages = Message.getInstance();

    public static void main(String[] args) {

        /*
            Listado de Electrodomesticos.
         */
        List<Electrodomestico> listElectrodomesticos = new ArrayList<>();

        /*
         primer electrodomestico
         */
        listElectrodomesticos.add(new Lavadora(250, "negro", 'F', 65, 85));
        listElectrodomesticos.add(new Lavadora(300, "rojo", 'A', 80, 65));
        listElectrodomesticos.add(new Lavadora(100, "blanco", 'B', 30, 100));
        listElectrodomesticos.add(new Lavadora(600, "gris", 'D', 20, 20));
        listElectrodomesticos.add(new Lavadora(450, "azul", 'C', 70, 70));

        listElectrodomesticos.add(new Television(250, "rojo", 'F', 65, 20, true));
        listElectrodomesticos.add(new Television(150, "negro", 'A', 70, 80, false));
        listElectrodomesticos.add(new Television(450, "blanco", 'B', 15, 60, true));
        listElectrodomesticos.add(new Television(100, "azul", 'E', 93, 10, false));
        listElectrodomesticos.add(new Television(50, "gris", 'C', 74, 0, true));

        /*
         * Recorremos el array y ejecutamos el metodo precio final
         */
        listElectrodomesticos.forEach(Electrodomestico::calculatePriceFinalWeight);


        messages.showMessage("****************lista de televisionres****************");
        listElectrodomesticos.stream().filter(Television.class::isInstance).forEach(list -> messages.showMessagePrice(String.valueOf(list.getPriceBase())));

        messages.showMessage("****************lista de Lavadoras****************");
        listElectrodomesticos.stream().filter(Lavadora.class::isInstance).forEach(list -> messages.showMessagePrice(String.valueOf(list.getPriceBase())));

        messages.showMessage("****************Suma de todos los precios de electrodomesticos****************");
        double precioTotal = listElectrodomesticos.stream().mapToDouble(Electrodomestico::getPriceBase).sum();
        messages.showMessagePrice("el precio de todos los electrodomesticos es " + precioTotal);

        messages.showMessage("****************Suma de todos los precios de televisores****************");
        double priceTV = listElectrodomesticos.stream().filter(Television.class::isInstance).mapToDouble(Electrodomestico::getPriceBase).sum();
        messages.showMessagePrice("el precio de todos los televisores es " + priceTV);

        messages.showMessage("****************Suma de todos los precios de lavadoras****************");
        double priceLavadoras = listElectrodomesticos.stream().filter(Lavadora.class::isInstance).mapToDouble(Electrodomestico::getPriceBase).sum();
        messages.showMessagePrice("el precio de todos los lavadoras es " + priceLavadoras);
    }
}
