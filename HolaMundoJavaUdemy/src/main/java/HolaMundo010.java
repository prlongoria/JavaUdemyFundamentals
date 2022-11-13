public class HolaMundo010 {
    public static void main(String args[]) {

        //operadores de igualdad:
        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println("c = " + c);//da false

        var d = a != b;
        System.out.println("d = " + d);//true

        //cademas:
        var cadena = "Hola";
        var cadena2 = "Hola";
        var e = cadena == cadena2;//compara referencias de objetos, compara los objetos para ver si apuntan a la misma ubicacion de memoria
        System.out.println("e = " + e);

        var f = cadena.equals(cadena2);//compara contenidos de cadenas, comparar los dos objetos para ver si tienen el mismo valor de objeto
        System.out.println("f = " + f);
        
        //Operadores relacionales:
        var g = a > b;
        System.out.println("g = " + g);
        
        var g2 = a >= b;
        System.out.println("g2 = " + g2);//true

        if (a % 2 == 0){
            System.out.println("Es par");
        }else {
            System.out.println("Es impar");
        }

        var edad = 30;
        var adulto = 18;
        if(edad >= adulto) {
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor");
        }
    }
}
