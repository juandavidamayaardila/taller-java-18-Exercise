package com.co.sofka.exercise14;

import com.co.sofka.messages.Message;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {
    /**
     * Instancia de la clase encargada de mostrar los mensajes
     */
    static Message messages = Message.getInstance();

    /**
     * Metodo que permite incializar la aplicacion.
     *
     * @param args parametro de inicio.
     */
    public static void main(String[] args) {
        int number = 0;
        while (number == 0) {
            try {
                Scanner capture = new Scanner(System.in);

                messages.showMessage("Por favor ingrese un numero");
                number = Integer.parseInt(capture.nextLine());

                printNumber(number);
            } catch (Exception e) {
                number = 0;
            }

        }

    }

    /**
     * Permite mostrar los numeros de dos en dos  hasta 1000
     *
     * @param number numero desde donde va iniciar la serie.
     */
    public static void printNumber(int number) {
        messages.showMessage("Los numeros son: ");
        for (int i = number; i <= 1000; i += 2) {
            messages.showMessage(valueOf(i));

        }
    }
}
