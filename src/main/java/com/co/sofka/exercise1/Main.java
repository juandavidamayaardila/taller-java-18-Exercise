package com.co.sofka.exercise1;

import com.co.sofka.messages.Message;


/**
 * Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si
 * son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
 */
public class Main {

    /**
     * Instancia de la clase encargada de mostrar los mensajes
     */
    static Message messages = Message.getInstance();

    /**
     * Metodo main que permite arrancar la aplicación
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

        double number1 = 5;
        double number2 = 2;

        Number number = new Number(); //Instanciamos la clase encargada de realizar la comparación

        number.setNumber1(number1); // asignamos el primer valor al altributo de la clase.

        number.setNumber2(number2); // asignamos el segundo valor al altributo de la clase.

        messages.showMessage(number.validationNumber()); // mostramos el mensaje correspondiente.

    }

}
