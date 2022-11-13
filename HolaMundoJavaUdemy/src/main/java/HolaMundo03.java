import java.util.Scanner;

public class HolaMundo03 {
    public static void main(String args []) {
        var nombre = "Karla";

        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);//pongo dos si quiero que retroceda dos espacios
        System.out.println("Comillas simples: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");

        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();//para que se detenga el programa hasta que el usuario escriba su información y esta se asignará a la variable usuario
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe tu título");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);

    }
}
