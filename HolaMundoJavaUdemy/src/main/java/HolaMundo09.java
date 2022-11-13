public class HolaMundo09 {
    public static void main(String args[]) {
        //Operadores unarios (cambio de signo)
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //Operador de negacion (para booleanos)
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //operador de preincrememto:
        var e = 3;
        var f = ++e;//primero se incrementa la variable y despues se usa su valor
        System.out.println("e = " + e);//me da 4
        System.out.println("f = " + f);//me da 4

        //postincremento:
        var g = 6;
        var h = g++; //primero se utiliza el valor de la variable y luego se incrementa
        System.out.println("g = " + g);//me dara 7, porque tenia pendiente un incremento
        System.out.println("h = " + h);//me dara 6

        //para los decrementos funciona igual:
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);//da 1
        System.out.println("j = " + j);//da 1

        var k = 4;
        var l = k--;
        System.out.println("k = " + k);//da 3
        System.out.println("l = " + l);//da 4




    }
}
