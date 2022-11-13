package operaciones;
//sobrecarga de métodos
public class Operaciones {
    public static int sumar(int a, int b)
    {
        System.out.println("sumar enteros ");
        return a + b;

    }
    //si meto más métodos con el mismo nombre, no pueden ser más restrictivos que el anterior:
    public static double sumar(double a, double b) {//puedo meter otro tipo de argumentos y  puede retornar otro tipo
        System.out.println("sumar double ");
        return a + b;
    }
}
