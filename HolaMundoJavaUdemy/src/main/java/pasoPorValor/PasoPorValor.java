package pasoPorValor;

public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);
        cambioValor(x);//estoy pasando una copia de la variable x hacia el argumento1
        System.out.println("x nuevo valor= " + x);//esto me dará el nuevo valor de x al meter yo un valor de 15 al
        //argumento1 porque sólo estoy pasando una copia de x, da igual que yo cambie el valor de la variable local
    }

    public static void cambioValor(int argumento1) {
        System.out.println("argumento1 = " + argumento1);
        argumento1 = 15;//es local, así que cuando llamo a este método desde otro lado, esta variable no aparece con
        //este valor

    }

    //si quiero que se cambie esa x a 15:
    //public static void main(String[] args) {
      //  var x = 10;
        //System.out.println("x = " + x);//imprime 10
        //x = cambioValor2(x);
        //System.out.println("x nuevo valor= " + x);//esto sí que imprime 15
    //}

   //public static int cambioValor2(int argumento1) {//debo cambiar el void por int para poder hacer el return
        //System.out.println("argumento1 = " + argumento1);
        //return argumento1 = 15;//es local, así que cuando llamo a este método desde otro lado, esta variable no aparece con
    //}

}
