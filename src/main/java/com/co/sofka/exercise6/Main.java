package com.co.sofka.exercise6;

import com.co.sofka.messages.Message;

/**
 * Realiza el ejercicio anterior (5) usando un ciclo for.
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
     * Metodo principal por donde inicia la aplicacion
     *
     * @param args parametro de inicializacion.
     */
    public static void main(String[] args) {
        init();

    }

    /**
     * Permite mostrar validar los numeros almacenarlos
     * y mostrarlos al final con la ayuda de la clase
     * Message.
     */
    public static void init() {
        String numerosPares = "";
        String numerosImPares = "";

        for (int iterator = 1; iterator < 100; iterator++) {
            if (iterator % 2 == 0) { //validamos si es par o impar
                numerosPares = numerosPares.concat(iterator + ", ");
            } else {
                numerosImPares = numerosImPares.concat(iterator + ", ");
            }
        }
        messages.showMessage("Numero pares son: " + numerosPares);
        messages.showMessage("Los numeros imapres son:  " + numerosImPares);
    }
}
