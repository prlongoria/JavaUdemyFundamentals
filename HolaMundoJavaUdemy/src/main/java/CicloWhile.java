public class CicloWhile {
    public static void main(String args[]) {
         var contador = 0;
        while (contador < 3) { //le pongo condicion que quiero que se incremente el contador 3 veces
            System.out.println("contador = " + contador);//imprime 0, 1, 2
            contador++;//para que se vaya incrementando
        }
    }
}
