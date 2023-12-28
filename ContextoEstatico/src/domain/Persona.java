
package domain;


public class Persona {

    private int idPersona;
    private String nombre;
    private static int contadorPersonas;

    public Persona(String nombre) {
        this.nombre = nombre;
        Persona.contadorPersonas++;
        this.idPersona = Persona.contadorPersonas;

    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    

}
