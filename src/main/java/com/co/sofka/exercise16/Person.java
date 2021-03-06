package com.co.sofka.exercise16;

import java.util.Random;

/**
 * Clase persona la cual tiene sus atributos y los metodos para calcular
 * el IMC de cada persona y verfiicar si es adulta o no.
 *
 * @author CW-DV-JDAA
 * @version 01.03.003 29/05/2022
 * @since 01.
 */
public class Person {
    /*
     * Constante para inicializar por defecto el genero de la persona.
     */
    private static final char DEFAULT_GENDER = 'H';

    private static final int AGE_ADULT = 18;
    private final Random rnd = new Random();

    private static final char[] LETTERS_LIST = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    private String name;
    private int age;
    private final char dni;
    private char gender = DEFAULT_GENDER;
    private double weight;
    private double height;

    /**
     * Constructor por defecto, inicializa el DNI
     */
    public Person() {
        this.dni = this.calculateDNI();
    }

    /**
     * Constructor que inicializa todos los atributos de la persona
     *
     * @param name   nombre de la persona.
     * @param age    edad de la persona.
     * @param gender genero de la persona.
     * @param weight peso de la persona.
     * @param height altura de la persona.
     */
    public Person(String name, int age, char gender, double weight, double height) {
        this.name = name;
        this.age = age;
        this.dni = this.calculateDNI();
        this.weight = weight;
        this.height = height;

        validateGender(gender);
    }

    /**
     * Constructor alterno con algunos atributos.
     *
     * @param name   nombre de la persona.
     * @param age    edad de la persona.
     * @param gender genero de la persona.
     */
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.dni = this.calculateDNI();
        validateGender(gender);
    }

    /**
     * Accede al valor del atributo name
     *
     * @return el valor del atributo
     */
    public String getName() {
        return name;
    }

    /**
     * Actualiza el valor del atributo name.
     *
     * @param name valor hacer actualizado.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Accede al valor del atributo edad.
     *
     * @return el valor del elemento edad.
     */
    public int getAge() {
        return age;
    }

    /**
     * Permite actualizar el valor del atributo edad
     *
     * @param age valor hacer actualizado.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Accede al valor del atributo DNI
     *
     * @return el valor del atributo.
     */
    public char getDNI() {
        return dni;
    }

    /**
     * Accede al valor del atributo genero.
     *
     * @return valor actual de atributo.
     */
    public char getGender() {
        return gender;
    }

    /**
     * Permite actualizar el valor del atributo genero.
     *
     * @param gender valor hacer actualizado.
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * Accede al valor del atributo peso.
     *
     * @return valor actual de atributo peso.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Permite actualizar el valor del atributo peso.
     *
     * @param weight valor hacer actualizado.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Accede al valor actual del atributo altura.
     *
     * @return valor actual del atributo.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Permite actualizar el valor del atributo altura.
     *
     * @param height valor hacer actualizado.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calcula el IMC de cada persona, hace uso de las constantes para
     * retornar el valor.
     *
     * @return -1 si esta en el peso ideal, 1 si esta en sobre peso,
     * 0 si esta en el peso ideal.
     */
    public int calculateIMC() {

        final int IDEAL_WEIGHT = -1;
        final int OVER_WEIGHT = 1;
        final int UNDER_WEIGHT = 0;

        double imc = getWeight() / (Math.pow(getHeight(), 2));

        if (imc < 20) {
            return IDEAL_WEIGHT;
        } else if (imc >= 20 && imc <= 25) {
            return UNDER_WEIGHT;
        } else {
            return OVER_WEIGHT;
        }
    }

    /**
     * Metodo que permite determinar si una persona
     * es mayor de edad
     *
     * @return true si es mayor de edad false si es lo contrario
     */
    public boolean isAdult() {
        return getAge() >= AGE_ADULT;
    }

    /**
     * Determina si el genero ingresado es correcto o no
     *
     * @param gender opcion ingresada por el usuario.
     */
    private void validateGender(char gender) {
        String genderTmp = String.valueOf(gender).toLowerCase();
        if ("H".equals(genderTmp) || "M".equals(genderTmp)) {
            this.gender = gender;
        } else {
            this.gender = DEFAULT_GENDER;
        }
    }

    /**
     * Genera un numeor aleatorio de maximo 8
     * digitos.
     *
     * @return numero entero de 8 digitos.
     */
    private int generateNumberDNI() {

        return rnd.nextInt(99999999);
    }

    /**
     * De acuerdo al numero generado de 8 digitos, se
     * determina que letra corresponde DNI.
     *
     * @return letra correspondiente segun numero generado.
     */
    private char calculateDNI() {
        int rest = generateNumberDNI() % 23;
        return Person.LETTERS_LIST[rest];
    }

    /**
     * Permite mostrar toda la informacion de la persona.
     *
     * @return cadena con toda la informacion.
     */
    @Override
    public String toString() {
        return "Persona{" +
               "name='" + getName() + '\'' +
               ", age=" + getAge() +
               ", DNI='" + getDNI() + '\'' +
               ", gender=" + getGender() +
               ", weight=" + getWeight() +
               ", height=" + getHeight() +
               '}';
    }
}
