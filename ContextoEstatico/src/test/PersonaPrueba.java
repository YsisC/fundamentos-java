
package test;

import domain.Persona;

public class PersonaPrueba {
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        imprimir(persona1);
            Persona persona2 = new Persona("Pedro");
        imprimir(persona2);
    }
    
    public static void imprimir (Persona persona){
          System.out.println("persona = "+ persona);
    }
}
