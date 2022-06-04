package com.co.sofka.exercise10;


import com.co.sofka.messages.Message;

import java.util.Scanner;

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
     * Inicia la aplicacion, reemplaza los espacios en blanco
     * y muestra el nuevo mensaje al usuario.
     */
    public static void init() {
        String data;
        String dataNew;

        messages.showMessage("Por favor ingrese una frase");
        data = capture.nextLine();

        dataNew = data.replace(" ", ""); //reemplazamos los espacios en blanco
        messages.showMessage("La nueva frase es " + dataNew);
    }
}
