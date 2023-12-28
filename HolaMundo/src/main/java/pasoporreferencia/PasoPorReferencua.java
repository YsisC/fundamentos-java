package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencua {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "González";
        System.out.println("Persona antes de cambiar valor: " + persona1.nombre + " " + persona1.apellido);
        cambiarValor(persona1);
        System.out.println("Persona después de cambiar valor: " + persona1.nombre + " " + persona1.apellido);
    }

    public static Persona cambiarValor(Persona persona) {
        persona.nombre = "Karla";
        return persona;
        // Aquí puedes agregar un return si es necesario
    }
}
