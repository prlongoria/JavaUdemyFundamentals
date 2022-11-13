import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        //Creo una matriz (como un array pero con renglones y columnas):
        int edades [][] = new int [3][2];//3 renglones por 2 columnas
        System.out.println("edades = " + edades);

        edades[0][0] = 5; //índice de renglón 0 columna 0
        edades[0][1] = 7;//renglón 0 columna 1
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 6;
        edades[2][1] = 3;

        System.out.println("edades = " + edades[0][1]);

        //ciclos for anidados para iterar todos los elementos de la matriz:
        for(int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("edades " + ren + "-" + col + ": " + edades[ren][col]);//esto imprime todos
                // los valores de la matriz
            }
        }

        //Sintaxis simplificada para matrices:
        String frutas[][] = {{"Naranja", "Limón"}, {"Fresa", "Zarzamora", "Manzana"}};
        //{{primer renglón con 2 columnas}, {segundo renglón con 3 columnas}}:

        //ciclo for anidado para iterar estos elementos:
        for (int ren = 0; ren < frutas.length; ren++) {
            for (int col = 0; col < frutas[ren].length; col++) {
                //System.out.println("Frutas " + ren + "-" + col + ": " + frutas[ren][col]);
                imprimir(frutas);
            }
        }

        //Creo una matriz de objetos:primero creo una matriz tipo Persona llamada personas:
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");//asigno un nuevo objeto al índice 0-0 con el valor de Juan
        personas[0][1] = new Persona("Karla");
        personas[0][2] = new Persona("Pepe");
        personas[1][0] = new Persona("Pepa");
        personas[1][1] = new Persona("Maria");
        personas[1][2] = new Persona("Mario");

        //llamoal método para iterar:
        imprimir(personas);
    }

    //Creo un método para poder imprimir mis matrices sin tener que repetir todo el tiempo el mísmo código:
    public static void imprimir(Object matriz[][]) {//método llamado imprimr cuyo argumento es tipo Object y se llama matriz
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("Matriz " + ren + "-" + col + ": " + matriz[ren][col]);
            }
        }
    }
}
