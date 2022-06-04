package com.co.sofka.exercise2;

import com.co.sofka.exercise1.Number;
import com.co.sofka.messages.Message;

import java.util.Scanner;

/**
 * Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si
 * son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
 * los numeros se debe ingresar por teclado
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
     * Metodo main que permite arrancar la aplicación.
     *
     * @param args para iniciar la aplicacion
     */
    public static void main(String[] args) {
        init();
    }

    /**
     * Metodo iniciador de la aplicacion donde se instancia las clases,
     * se invoca la clase para mostrar los mensajes.
     */
    public static void init() {

        boolean flag = true;
        double number1 = 0;
        double number2 = 0;

        while (Boolean.TRUE.equals(flag)) {
            try {
                messages.showMessageExercise1();
                number1 = Double.parseDouble(capture.nextLine());

                messages.showMessageExercise1();
                number2 = Double.parseDouble(capture.nextLine());
                flag = false;
            } catch (Exception e) {
                messages.showMessage(e.getMessage());
                messages.showMessageExercise1();
            }
        }

        Number number = new Number(); //Instanciamos la clase encargada de realizar la comparación

        number.setNumber1(number1); // asignamos el primer valor al altributo de la clase.
        number.setNumber2(number2); // asignamos el segundo valor al altributo de la clase.

        messages.showMessage(number.validationNumber()); // mostramos el mensaje correspondiente.

    }

}
