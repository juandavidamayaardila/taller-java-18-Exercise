package com.co.sofka.exercise11;


import com.co.sofka.messages.Message;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola,
 * indicar cual  es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”
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

        String data;

        HashMap<Character, Integer> listVowels = new HashMap<>();
        listVowels.put('a', 0);
        listVowels.put('e', 0);
        listVowels.put('i', 0);
        listVowels.put('o', 0);
        listVowels.put('u', 0);

        messages.showMessage("Por favor ingrese una cadena!!");
        data = capture.nextLine();

        char[] tmp = data.toCharArray();

        messages.showMessage("La longitud de la cadena es " + data.length());

        for (char c : tmp) {
            if (isVowels(c)) {
                listVowels.put(c, listVowels.get(c) + 1);
            }
        }

        listVowels.forEach((k, v) -> messages.showMessage("la vocal " + k + " esta " + v + " veces"));
    }

    /**
     * Permite determinar si las vocales estan incluidas o no en la
     * cadena ingresada
     *
     * @param letter letra a ser comparada en la cadena.
     * @return true si la volcal esta incluida false de lo contario.
     */
    public static boolean isVowels(Character letter) {
        return "aeiou".contains(String.valueOf(letter).toLowerCase());
    }
}
