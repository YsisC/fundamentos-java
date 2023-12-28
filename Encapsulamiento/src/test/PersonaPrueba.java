package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000.00, false);
        System.out.println("persona nombre : " + persona1);
        persona1.setNombre("juan Carlos");

        System.out.println("persona nombre con cambio :" + persona1.getNombre());
        System.out.println(persona1);

    }

}
