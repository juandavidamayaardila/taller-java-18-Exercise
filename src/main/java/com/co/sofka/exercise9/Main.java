package com.co.sofka.exercise9;

import com.co.sofka.messages.Message;

/**
 * Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas
 * las a del String anterior por una e, adicionalmente concatenar a esta frase una
 * adicional que ustedes quieran incluir por consola y las muestre luego unidas.
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
     * Constante con la frase inicial.
     */
    static final String DATA = "la sonrisa sera la mejor arma contra la tristeza";

    public static void main(String[] args) {
        init();
    }

    /**
     * Metodo inicial el cual instancia las clases necesarios
     * invocar las validaciones y mostrar los mensajes.
     */
    public static void init() {

        String dataNew = DATA.replace('a', 'e'); //remplazamos las vocales a por e
        String newMessage = dataNew.concat(", Si puedo!!"); //concatenamos un frase

        messages.showMessage("El mensaje es: " + DATA);
        messages.showMessage("El nuevo mensaje es: " + newMessage);
    }
}
