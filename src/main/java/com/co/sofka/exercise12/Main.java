package com.co.sofka.exercise12;

import com.co.sofka.messages.Message;

import java.util.Scanner;

/**
 * Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
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

        String wordFirst;
        String wordSecond;

        messages.showMessage("Por favor ingrese la primer palabra a comparar");
        wordFirst = capture.nextLine();

        messages.showMessage("Por favor ingrese la segunda palabra a comparar");
        wordSecond = capture.nextLine();

        validateWords(wordFirst, wordSecond);
    }

    /**
     * Recorre las dos palabras y las compara posicion a posicion, para determinar
     * si son iguales o no.
     *
     * @param wordFirst  palabra hacer comparada.
     * @param wordSecond palabra hacer comparada.
     */
    public static void validateWords(String wordFirst, String wordSecond) {
        StringBuilder bld = new StringBuilder();
        String differences = "";
        int equalCharacterCounter;
        for (int i = 0; i < wordFirst.length(); i++) {
            equalCharacterCounter = 0;
            for (int j = 0; j < wordSecond.length(); j++) {
                if (wordFirst.charAt(i) == wordSecond.charAt(j)) {
                    equalCharacterCounter++;
                }
            }
            if (equalCharacterCounter == 0) {
                bld.append(wordFirst.charAt(i));
            }
            differences = bld.toString();
        }
        if (wordFirst.equals(wordSecond)) {
            messages.showMessage("Las palabras son iguales");
        } else if (differences.equals("")) {
            messages.showMessage("La palabra " + wordFirst + " contiene todas las letras de la palabra "
                                 + wordSecond);
        } else {
            messages.showMessage("La diferencia de la palabra " + wordFirst + " con respecto a la palabra " + wordSecond
                                 + " es: " + differences);
        }
    }
}
