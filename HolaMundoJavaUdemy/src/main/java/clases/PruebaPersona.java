package clases;

public class PruebaPersona { //la he metido en el mismo paquete que la clase Persona, y aqui meto el metodo main para poder ejecutar el codigo
    public static void main(String args[]) {
        //voy a crear objetos de la clase Persona:
        Persona persona1; //declaro una variable (persona1) de la clase Persona
        persona1 = new Persona(); //así creo el objeto de la clase persona, instancio la clase Persona (objeto que contiene los atributos nombre y apellido, y que ahora debo asignarles valores). ES UNA REFERENCIA EN MEMORIA (0X333)
        //Persona persona1 = new Persona(); También podría hacerlo en una sola línea pues se reserva espacio de memoria y esta referencia de memoria se le asigna a la variable persona1, y por eso puedo acceder a los atributos para leerlos o modificarlos
        persona1.nombre = "Juan"; //asigno un valor a persona1 para el atributo nombre
        persona1.apellido = "Perez";
        persona1.desplegarInformacion(); //llamo al método de la clase Persona que deseo usar
//le doy a ejecutar y ahora ya me imprime el nombre y apellido del objeto persona1 de la clase Persona

        //Puedo definir tantos objetos de la clase Persona como quiera:
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2); //(como lo mando imprimir sin llamar al método) sin esto imprime persona2 = clases.Persona@2d98a335 (nombre del paquete, nombre de la clase y @ con un valor que es la referencia de memoria de este objeto
        persona2.desplegarInformacion();//si hago esto sin dar valor a los atributos, imprime Nombre: null y Apellido: null
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.desplegarInformacion();//ahora sí que imprime los valores de los atributos que le asigné a persona2

    }
}
