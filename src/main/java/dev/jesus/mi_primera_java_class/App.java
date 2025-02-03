package dev.jesus.mi_primera_java_class;

import dev.jesus.mi_primera_java_class.persona.Persona;

/**
 * Hello world!
 */
public final class App {
    public static void main(String[] args) {
        Persona persona = new Persona("Arturito", "Román", "12345678", 1990);
        persona.mostrarInformacion();
    }
}
