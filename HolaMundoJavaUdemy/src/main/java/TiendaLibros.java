import java.util.Scanner;

public class TiendaLibros {
    public static void main(String args[]) {

        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu nombre:");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);


        System.out.println("Proporciona el id:");
        var idLibro = consola.nextLine();
        System.out.println("idLibro = " + idLibro);

        System.out.println("Proporciona el precio:");
        var precio = consola.nextLine();
        System.out.println("precio = " + precio);

        System.out.println("Quieres el envio gratuito:");
        var envioGratuito = consola.nextLine();
        System.out.println("envioGratuito = " + envioGratuito);

        System.out.println(nombre + " " + idLibro);
        System.out.println("Precio: " + precio + " " + "euros");
        System.out.println("Envio Gratuito: " + envioGratuito);



    }
}
