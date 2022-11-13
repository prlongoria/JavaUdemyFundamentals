package pasoPorReferencia;

import clases.Persona;

public class PasoPorReferencia {
    //public static void main(String[] args) {
        //Persona persona1 =new Persona();//esta clase tiene dos atributos, nombre y apellido
            //la variables de tipo object almacenan atributos, pero para poder accederlos desde otra clase como aquí, debo
            //crear un método para accederlos o bien, ir a la clase Persona y ponerles public delante(no es buena práctica,
            //pero lo hago ahora porque así lo manda el video)
        //persona1.nombre = "Juan";
        //System.out.println("persona1 nombre = " + persona1.nombre);
        //cambiarValor(persona1);//persona1 almacena la referencia del objeto que se creó arriba, así que está apuntando al
            //mismo objeto que la variable persona1 del método de abajo cambiarValor
        //System.out.println("persona1 cambiada= " + persona1.nombre);//ahora imprime Karla
    //}

    //public static void cambiarValor(Persona persona1) {//void porque no regresa nada
            //la variable persona1 de aquí apunta al mismo objeto que la variable persona1 del método main
            //así que puedo modificar los atributos del objeto al que estoy apuntando
        //persona1.nombre = "Karla";//al cambiar aquí el nombre, si voy al main y mando de nuevo a imprimirlo
            //saldrá Karla
    //}

    //si quiero que el método regrese algo:
    public static void main(String[] args) {
        Persona persona1 =new Persona();
        persona1.nombre = "Juan";
        System.out.println("persona1 nombre = " + persona1.nombre);
        persona1 = cambiarValor2(persona1);//asigno el return a la variable persona1
        System.out.println("persona1 cambiada= " + persona1.nombre);
    }

    public static Persona cambiarValor2(Persona persona) {//tipo object que es la clase Persona
        persona.nombre = "Carla";//modifico el atributo del objeto persona
        return persona;//retorna la referencia del objeto persona
    }
}
