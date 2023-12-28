package caja;

public class PruebaCaja {

    public static void main(String args[]) {
        Caja caja1 = new Caja(5, 7, 10);

        caja1.calcularVolumen();

        int resultado = caja1.calcularVolumenConRetorno();
        System.out.println("volumen con retono " + resultado);

    }

}
