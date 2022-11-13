import java.util.Scanner;

public class HolaMundo06 {
    public static void main(String args[]) {
        //convertir tipo String a int:
        var edad = Integer.parseInt("20");//el String "20" lo convierto a integer
        System.out.println("edad = " + (edad + 1));//hace la suma de 20+1 porque edad la converti a int

        var valorPI = Double.parseDouble("3.1416");//convierto String a tipo double
        System.out.println("valorPI = " + valorPI);

        //pedir un valor:
        var consola = new Scanner(System.in);
        System.out.println("Dime tu edad: ");
        edad = Integer.parseInt(consola.nextLine());//lo paso a Integer porque sino me marca error. Si el usuario no mete un numero, le dara error porque he convertido el string a numero
        System.out.println("edad = " + edad);

        //convertir int a String:
        var edadTexto = String.valueOf(10);//convierto el int a String
        System.out.println("edadTexto = " + edadTexto);

        //convertir a char (un solo caracter):
        var caracter = "hola".charAt(0); //para que me imprima el caracter que quiero. Lo he convertido a tipo char
        System.out.println("caracter = " + caracter);

        System.out.println("Dame un caracter: ");
        caracter = consola.nextLine().charAt(2);//meto aqui el caracter que quiero que me devuelva
        System.out.println("caracter = " + caracter);

    }
}
