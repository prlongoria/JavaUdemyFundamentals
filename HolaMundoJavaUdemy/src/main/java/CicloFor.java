public class CicloFor {
    public static void main(String args[]) {
        //revisa condicion y si es verdadera se ejecuta el código (haciendo un incremento o decremento del contador) hasta que la condicion sea falsa
        for (var contador = 0; contador < 3; contador++) {
            System.out.println("contador = " + contador);
        }//en este caso, la variable contador sólo existe dentro del ciclo for

        //break (detiene el ciclo en cuanto encuentra la primera vez que se cumple la condición) y continue(detiene el ciclo en cuanto se cumple la condición y va directamente a la siguiente iteracion:
        for (var contador = 0; contador < 3; contador++) {
            if (contador % 2 == 0) {
                System.out.println("contador = " + contador);
                break;//si pongo esto, sólo imprime el primer número par que encuentra, o sea, el 0.
            }
        }

        for (var contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {//si pongo ==0, lo que imprimira es el numero impar menor de 3
                continue;//si encuentra un numero impar, pasa a la siguiente interacion que imprimira todos los numeros que son pares
            }
            System.out.println("contador = " + contador);

        }
    }
}
