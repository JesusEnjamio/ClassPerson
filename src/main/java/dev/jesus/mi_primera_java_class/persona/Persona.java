package dev.jesus.mi_primera_java_class.persona;

public class Persona {
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private int añoNacimiento;

    // Constructor
    public Persona(String nombre, String apellido, String numeroDocumento, int añoNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.añoNacimiento = añoNacimiento;
    }


    // Método para mostrar información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Número de Documento: " + numeroDocumento);
        System.out.println("Año de Nacimiento: " + añoNacimiento);
    }

   
    
}
