package com.co.sofka.messages;

import org.jboss.logging.Logger;

public class Message {

    /**
     * Constante que permite mostrar los mensajes al usuario.
     */
    private static final Logger logger = Logger.getLogger(Message.class);

    /**
     * Permite acceder a la instancia de la clase.
     *
     * @return la instancia de la clase.
     */
    public static Message getInstance() {
        return new Message();
    }

    /**
     * Permite mostrar el mensaje al usuario cuando el
     * perro esta ladrando.
     *
     * @param data estado actual del atributo Bark
     */
    public void showMessage(String data) {
        logger.info(data);
    }

    public void showMessageExercise1() { logger.info("Por favor ingrese un numero!! "); }

    public void showMessageInitialExercise3() { logger.info("Por favor ingrese el valor del radio!"); }

    public void showMessageExercise4() { logger.info("Por favor ingrese el precio del producto!! "); }

    public void showMessageExercise7() { logger.info("Por favor ingrese un numero!! "); }

    public void showMessageExercise8() { logger.info("Por favor ingrese un dia de la semana!! "); }

    public void showMessagePrice(String data) {
        logger.info(data + " Dolares");
    }
}
