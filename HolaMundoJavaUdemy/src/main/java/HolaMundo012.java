public class HolaMundo012 {
    public static void main(String args[]) {
        //operador ternario:
        var resultado = (3 > 2) ? "verdadero" : "falso";
        //valor booleano ? lo que se ejecuta si es veradero : lo que se ejecuta si es falso;
        System.out.println("resultado = " + resultado);//da verdadero

        var numero = 8;
        resultado = (numero % 2 == 0) ? "EL numero es par" : "El numero es impar";
        System.out.println("resultado = " + resultado
        );
    }
}
