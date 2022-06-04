package com.co.sofka.exercise3;

import com.co.sofka.messages.Message;

import java.util.Scanner;

/*
 Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por
 teclado (recuerda pasar  de String a double con Double.parseDouble). Usa la constante PI
 y el método pow de Math.
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
     * Metodo iniciador de la aplicacion donde se instancia las clases,
     * se invoca la clase para mostrar los mensajes.
     */
    public static void main(String[] args) {
       init();
    }

    /**
     * metodo inicial donde se instancia las clases y se
     * se muestran los mensajes al usuario.
     */
    public static void init(){
        Circle circle = new Circle();

        messages.showMessage("Por favor ingrese el valor del radio!");
        double radio = Double.parseDouble(capture.nextLine());

        double valueArea = circle.calculateArea(radio); //Calculamos el area del circulo.

        messages.showMessage("El valor del area es: " + valueArea);
    }
}
