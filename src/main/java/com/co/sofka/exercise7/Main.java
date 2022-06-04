package com.co.sofka.exercise7;

import com.co.sofka.messages.Message;

import java.util.Scanner;

/**
 * Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no
 * lo es lo volverá a pedir (do while), después muestra ese número por consola.
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
     * Metodo principal por donde inicia la aplicacion
     *
     * @param args parametro de inicializacion.
     */
    public static void main(String[] args) {

    }

    /**
     * Metodo inicial el cual instancia las clases necesarios
     * para solicitar el precio del producto, calcular y mostrar
     * el resultado.
     */
    public static void init() {
        int number;
        do {
            try {
                messages.showMessageExercise7();
                number = Integer.parseInt(capture.nextLine());
            } catch (Exception e) {
                messages.showMessage(e.getMessage());
                number = -1; // asignamos un valor negativo para seguir ejecutando el ciclo.
            }
        } while (number < 0);

        messages.showMessage("El numero ingresado es: " + number);
    }
}
