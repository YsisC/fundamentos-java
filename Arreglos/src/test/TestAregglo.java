package test;

public class TestAregglo {

    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades.length);

        edades[0] = 10;
        System.out.println("edades 0 = " + edades[0]);

        edades[1] = 20;
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades elemto = " + edades[i]);

        }
        
        String frutas[] = {"Naranja", "Platano", "Uva"};
        for (int i = 0; i < frutas.length; i++) {
              System.out.println("frutas elemto = " + frutas[i]);
        }

    }

}
