package com.co.sofka.exercise8;


import com.co.sofka.messages.Message;

import java.util.Scanner;

/**
 * Crea una aplicación por consola que nos pida un día de la semana y
 * que nos diga si es un día laboral o no. Usa un switch para ello.
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
     * invocar las validaciones y mostrar los mensajes.
     */
    public static void init() {
        String dayWeek;
        Laboral laboral = new Laboral();

        messages.showMessageExercise8();

        boolean flag = true; // bandera para detener el ciclo.
        do {
            dayWeek = capture.nextLine();

            try {
                if (laboral.validatorNameDay(dayWeek)) { // validamos si es un dia valido
                    laboral.setDia(dayWeek);
                    if (laboral.validatorDayWeek()) { // validamos si es laboral o no
                        messages.showMessage("Es un dia laboral");
                    } else {
                        messages.showMessage("No es un dia laboral");
                    }
                    flag = false;
                } else {
                    messages.showMessage("Por favor ingrese un dia valido");
                }
            } catch (Exception e) {
                messages.showMessage(e.getMessage());
            }
        }
        while (Boolean.TRUE.equals(flag));
    }
}
