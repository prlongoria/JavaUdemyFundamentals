public class CicloDoWhile {
    public static void main(String args[]) {
        //se pone primero el código a repetir, así que se ejecuta al menos una vez, antes de evaluar si la condición es true o false
        var contador = 0;
        do{
            System.out.println("contador = " + contador);//según la condicion que le ponga imprimirá contador = 0 (esto lo imprime sí o sí) y a continuación contador 0 = 1, etc hasta que la condición sea falsa
            contador++;
        }while ( contador < 3);//al poner una condicion, consigo que no sea ciclo infinito
    } //si la condicion fuera contador < 0, seria falsa, pero se ejecuta una vez el código e imprimiría contador = 0
}
