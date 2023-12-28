package operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        
        //variable local 
        var a = 10;
        var b = 2;
        miMetodo();
        
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmerica b: " + aritmetica1.b);
        System.out.println("aritmerica a: " + aritmetica1.a);

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmerica b: " + aritmetica2.b);
        System.out.println("aritmerica a: " + aritmetica2.a);

    }

    public static void miMetodo(){
        System.out.println("otro metodo");
    }
}
