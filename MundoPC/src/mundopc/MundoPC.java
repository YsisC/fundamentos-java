package mundopc;

import mx.com.gm.mundopc.*;

public class MundoPC {

    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooh", "HP");
        Raton ratonHP = new Raton("bluetooh", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP,
                tecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("Gamer", 13);
        Teclado tecladoGamer = new Teclado("bluetooh", "Gamer");
        Raton ratonGamer = new Raton("bluetooh", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer,
                tecladoGamer, ratonGamer);

        Orden orden1 = new Orden();

        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();

    }

}
