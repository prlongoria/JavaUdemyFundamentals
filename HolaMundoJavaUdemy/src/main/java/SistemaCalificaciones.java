import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String args[]) {

        var calificacionTexto = "Desconocido";

        var scanner = new Scanner(System.in);
        System.out.println("Dime puntuación: ");
        var puntuacion = Integer.parseInt(scanner.nextLine());



        if (puntuacion >= 0 && puntuacion < 6){
            calificacionTexto = "F";
        }
        else if (puntuacion >= 7 && puntuacion < 6){
            calificacionTexto = "D";
        }
        else if (puntuacion >= 7 && puntuacion < 8){
            calificacionTexto = "C";
        }
        else if (puntuacion >= 8 && puntuacion < 9){
            calificacionTexto = "B";
        }
        else if (puntuacion >= 9 && puntuacion <= 10){
            calificacionTexto = "A";
        }
        System.out.println("calificacionTexto = " + calificacionTexto);
    }
}
