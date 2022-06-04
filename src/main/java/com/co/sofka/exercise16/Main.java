package com.co.sofka.exercise16;

import com.co.sofka.messages.Message;

import java.util.Scanner;

/**
 * Permite crear personas y calcular IMC, dependiendo de su edad
 * altura
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
        getDataUsuario();
    }

    public static void getDataUsuario() {
        String name;
        int age;
        char gender;
        double weight;
        double height;

        messages.showMessage("*****Sistema para calcular el indice de masa corporal****");
        messages.showMessage("Por favor ingrese el nombre");
        name = capture.nextLine();

        messages.showMessage("Por favor ingrese la edad");
        age = Integer.parseInt(capture.nextLine());

        messages.showMessage("Por favor ingrese el genero de la persona");
        gender = capture.nextLine().charAt(0);


        messages.showMessage("Por favor ingrese el peso en kilogramos");
        weight = Double.parseDouble(capture.nextLine());

        messages.showMessage("Por favor ingrese la altura de la persona");
        height = Double.parseDouble(capture.nextLine());

        /*
         * el primer objeto obtendrá las anteriores variables pedidas por teclado
         */
        Person person1 = new Person(name, age, gender, weight, height);

        /*
         * Realizamos la comprobacion de cada persona,
         * su IMC si es adulta y mostramos la información.
         */
        printIMC(person1);
        isAdult(person1);
        messages.showMessage(person1.toString());

        messages.showMessage("******************Persona 2 ****************************");

        /*
            el segundo objeto obtendrá todos los anteriores menos el peso y la altura
         */
        messages.showMessage("Persona 2: Por favor ingrese el nombre");
        name = capture.nextLine();

        messages.showMessage("Persona 2: Por favor ingrese la edad");
        age = Integer.parseInt(capture.nextLine());

        messages.showMessage("Persona 2: Por favor ingrese el genero de la persona");
        gender = capture.nextLine().charAt(0);

        Person person2 = new Person(name, age, gender);
        person2.setHeight(1.80);
        person2.setWeight(85);

        /*
         * Realizamos la comprobacion de cada persona,
         * su IMC si es adulta y mostramos la información.
         */
        printIMC(person2);
        isAdult(person2);
        messages.showMessage(person2.toString());

        /*
         * Tercerae por defecto, para este último utiliza los métodos set
         * para darle a los atributos un valor.
         */
        messages.showMessage("******************Persona 3 ****************************");
        Person person3 = new Person();

        person3.setName("Jesus");
        person3.setAge(65);
        person3.setGender('H');
        person3.setWeight(56);
        person3.setHeight(1.50);

        /*
         * Realizamos la comprobacion de cada persona,
         * su IMC si es adulta y mostramos la información.
         */
        printIMC(person3);
        isAdult(person3);
        messages.showMessage(person3.toString());

    }

    /**
     * Permite imprimir el IMC de cada persona apoyados en el metodo
     * calculateIMC de la clase persona.
     *
     * @param person Persona a la que se la calcula el IMC
     */
    public static void printIMC(Person person) {
        final String message;
        message = "El señor@";
        if (person.calculateIMC() == -1) {
            messages.showMessage(message + person.getName() + " se encuentra en peso ideal");
        } else if (person.calculateIMC() == 0) {
            messages.showMessage(message + person.getName() + " se encuentra por debajo de su peso ");
        } else {
            messages.showMessage(message + person.getName() + " se encuentra en sobre peso");
        }
    }

    /**
     * Verificamos si la persona es adulta o no.
     *
     * @param person versona a quien se le va hacer la verificación.
     */
    public static void isAdult(Person person) {
        if (person.isAdult()) {
            messages.showMessage(person.getName() + " es mayor de edad");
        } else {
            messages.showMessage(person.getName() + "NO es mayor de edad");
        }
    }


}
