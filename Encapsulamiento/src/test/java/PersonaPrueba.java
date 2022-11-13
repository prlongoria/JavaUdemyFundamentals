import dominio.Persona;

//separo la clase Persona (paquete dominio) de clase Persona Prueba (paquete test), es buena práctica
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000, false);
        System.out.println("persona1 nombre que tiene " + persona1.getNombre());//imprime el nombre actual
        persona1.setNombre("Juan Carlos");//solo con este método puedo acceder a cambiar el nombre y aqui he cambiado el nombre
        System.out.println("persona1 nombre cambiado = " + persona1.getNombre());//imprime el nombre despues de haberlo cambiado
        System.out.println("boolean de persona1 " + persona1.isEliminado());

        System.out.println("persona1 con toString: " + persona1);//así me imprimirá todos los datos de persona1.
        //no sería necesario poner persona1.toString, bastaría con poner persona1 si ya tengo definido el método
        // //toString porque Java lo llama por defecto
    }
}
