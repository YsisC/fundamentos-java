package test;

import dominio.Cliente;
import dominio.Empleado;
import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {
         Empleado empleado1 = new Empleado("Juan", 5000.00);
        System.out.println("empleado = "+ empleado1);
            Empleado empleado2 = new Empleado("Pedro", 4500.00);
         System.out.println("empleado = "+ empleado2);
        //var fecha = new Date();
        //Cliente cliente1 = new Cliente(fecha, true, "Karla", 'F', 28, "Coronel souper 4438");
        //System.out.println("cliente = " + cliente1);
    }

}
