package com.co.sofka.exercise15;

import com.co.sofka.messages.Message;

import java.util.Scanner;
import java.util.logging.Logger;

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
        Logger logger = Logger.getLogger("log");
        Scanner capture = new Scanner(System.in);
        int control = 0;

        while (control != 8) {
            try {
                logger.info("****GESTION CINEMATROGRAFICA*******");

                messages.showMessage("""
                        1-NUEVO ACTOR\040
                        2-BUSCAR ACTOR\040
                        3-ELIMINAR ACTOR\040
                        4- MODIFICACION ACTOR\040
                        5- VER TODOS LOS ACTORES\040
                        6-VER PELICULAS DE ACTORES\040
                        7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\040
                        8-SALIR""");

                control = Integer.parseInt(capture.nextLine());
                if (!validatorMenu(control)) {
                    messages.showMessage("OPCION INCORRECTO");
                }
            } catch (Exception e) {
                control = 0;
            }

        }
    }

    /**
     * Permite validar si la opcion ingresada por el usuario es valida
     * esta incluida en el menu.
     *
     * @param control opcion ingresada por el usuario.
     * @return true si la opcion es valida.
     */
    public static boolean validatorMenu(int control) {
        return switch (control) {
            case 1, 2, 3, 4, 5, 6, 7, 8 -> true;
            default -> false;
        };
    }
}
