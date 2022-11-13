public class HolaMundo07 {
    public static void main(String args[]) {
        int a = 3, b = 2;//puedo declarar asi las variables solo si les pongo tipo int, si les pusiera tipo var solo
                            //podria declararlas una a una:
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);

        resultado = a / b;//no imprime decimales porque declare las variables como int, si una de ellas fuera float, entonces si que me daria los decimales
        System.out.println("resultado division = " + resultado);

        var resultado2 = 3D / b;//asi dara con decimales
        System.out.println("resultado2 = " + resultado2);

        resultado = a % b;//me da 1
        System.out.println("resultado = " + resultado);

        if (a % 2 == 0) {
            System.out.println("Es numero par");
        }else {
            System.out.println("Es impar");
        }
    }
}
