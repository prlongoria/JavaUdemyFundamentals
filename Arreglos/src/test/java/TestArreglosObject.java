import domain.Persona;
//Los arrays se definen en plural
public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2]; //defino un arreglo de la clase Persona y la cantidad
        // de elementos que quiero que contenga

        System.out.println("personas = " + personas[0]);//por defecto, el valor de sus elementos es null ya que
        //este array es un objeto

        //quiero modificar los valores de los elementos:para ello debo crear un nuevo objeto:
        personas[0] =new Persona("Juan");//así le doy el valor Juan al primer elemento de mi array,
        // y puedo hacerlo gracias al constructor que recibe un string nombre

        personas[1] = new Persona("Karla");

        System.out.println("personas primer elemento = " + personas[0]);//mando a llamar al método toString
        System.out.println("personas segundo elemento = " + personas[1]);//mando a llamar al método toString

        //ciclo for para recorrer el array tipo object:
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas = " + i + personas[i]);//mando a llamar al método toString
        }

    }
}
