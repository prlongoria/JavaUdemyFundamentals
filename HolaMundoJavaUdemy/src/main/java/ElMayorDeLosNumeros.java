import java.util.Scanner;

public class ElMayorDeLosNumeros {
    public static void main(String args[]) {
        var scanner = new Scanner(System.in);

        System.out.println("Proporciona el número 1: ");
        var numero1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Proporciona el número 2: ");
        var numero2 = Integer.parseInt(scanner.nextLine());

        if(numero1 > numero2) {
            System.out.println("El número mayor es " + numero1);
        }
        if (numero1 < numero2) {

            System.out.println("El número mayor es " + numero2);
        }else {
            System.out.println("El " + numero1 + " es igual que el " + numero2);
        }
    }
}
