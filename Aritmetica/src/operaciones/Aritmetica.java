/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

public class Aritmetica {

    //atributos
    int a;
    int b;
// connstructor
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }
        public Aritmetica(int a, int b){
       this.a = a;
       this.b = b;
         System.out.println("Ejecutando constructor con argumentos");
    }
    //metodo
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        int resultado = a + b;
        return resultado;
    }

    public int sumarConArgmero(int arg1, int arg2) {
        a = arg1;
        b = arg2;
        int resultado = a + b;
        return resultado;
    }

}
