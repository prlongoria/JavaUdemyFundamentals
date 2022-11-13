public class TestArreglos {
    public static void main(String[] args) {
        //defino un array tipo entero:(heredan de la clase Object)
        int edades[] = new int[3];//instancio un array, debo poner el tipo y entre[] el número de elementos
        // que quiero que contenga
         //los arreglos no pueden crecer de manera dinámica

        System.out.println("edades = " + edades);//si hago debug me sale que tiene 3 elementos y su valor
        // por defecto que es 0

        //Voy a acceder a los elementos del array para modificarlos:
        edades[0] =10;
        System.out.println("edades primer índice= " + edades[0]);

        edades[1] = 5;
        edades[2] = 3;
        System.out.println("edades = " + edades[0] + edades[1] + edades[2]);

        //Ciclo for para saber el máximo de elementos que tiene el array:
        for(int i = 0; i < edades.length; i++) {
            System.out.println("edades elemento " + i + ": " + edades[i]);//así imprime cada elemento con su valor
        }
        //hasta aquí he trabajado con array tipo entero(primitivo)

        //Si qusiera inicializar los valores del arreglo desde el principio (sintaxis resumida):
        String frutas[] = {"naranja", "uva", "manzana"};//defino el array ya con los valores de sus elementos asignados.
        //esto funciona tanto para tipo object como primitivos
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
        }

    }
}
