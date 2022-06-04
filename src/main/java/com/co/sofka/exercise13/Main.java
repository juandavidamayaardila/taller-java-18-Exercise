package com.co.sofka.exercise13;


import com.co.sofka.messages.Message;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


/**
 * Realizar un algoritmo que permita consulta la fecha y hora actual
 * en el formato (AAAA/MM/DD) (HH:MM:SS)
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

        LocalDateTime dateNow = LocalDateTime.now();
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        messages.showMessage("La hora actual es: " + formater.format(dateNow));
    }
}
