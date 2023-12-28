/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caja;

public class Caja {

    int ancho;
    int alto;
    int profundo;

    public Caja() {
        System.out.println("Ejecutando constructor");
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        System.out.println("Ejecutando constructor con argumentos");

    }
    //metodo

    public void calcularVolumen() {
        int volumen = this.ancho * this.alto * this.profundo;
        System.out.println("resultado por void = " + volumen);
    }

    public int calcularVolumenConRetorno() {
        int volumen = this.ancho * this.alto * this.profundo;
        return volumen;
    }

}
