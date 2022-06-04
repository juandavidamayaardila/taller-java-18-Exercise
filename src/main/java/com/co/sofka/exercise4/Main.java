package com.co.sofka.exercise4;

import com.co.sofka.messages.Message;

import java.util.Scanner;

/**
 * Lee un número por teclado que pida el precio de un producto (puede tener decimales) y
 * calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
 *
 * @author CW-DV-JDAA
 * @version 01.03.003 29/05/2022
 * @since 01.
 */
public class Main {
    /**
     * Instancia de la clase encargada de mostrar los mensajes
     */
    static Message messages = Message.getInstance();

    /**
     * Instancia que permite leer la informacion por teclado.
     */
    static Scanner capture = new Scanner(System.in);

    /**
     * Metodo que permite incializar la aplicacion.
     *
     * @param args parametro de inicio.
     */
    public static void main(String[] args) {
        init();
    }

    /**
     * Metodo inicial el cual instancia las clases necesarios
     * para solicitar el precio del producto, calcular y mostrar
     * el resultado.
     */
    public static void init() {
        Product product = new Product();
        double price;
        boolean flag = true; // bandera para detener el ciclo.

        while (Boolean.TRUE.equals(flag)) {
            try {
                messages.showMessageExercise4();
                price = Double.parseDouble(capture.nextLine());
                product.setPrice(price); // cargamos el precio en el atributo de la clase Product
                flag = false;
            } catch (Exception e) {
                messages.showMessage(e.getMessage());
            }
        }
        double priceWhitIVA = product.calculatePriceWhitIVA(); // calculamos el precio con el iva incluido
        messages.showMessage("El precio del producto es: " + priceWhitIVA);
    }
}
