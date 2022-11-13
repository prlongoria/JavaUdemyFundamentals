package clases;

public class Persona {

        //primero se definen los atributos de la clase
        //segundo se definen los métodos de la clase (a los que puedo llamar las veces que necesite y pueden recibir valores(argumentos). Un método puede regresar un valor(valor de retorno)
        //para poder utilizar la clase, debo instanciarla, es decir, crear objetos de esta clase


        //atributos:
        public String nombre;
        public String apellido;

        //método: (public para que se pueda acceder desde todos lados y void porque no regresa ningún tipo de información
        public void desplegarInformacion () {
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
        }

        //aquí podría poner el método main de esta clase, pero es mejor crear una nueva clase (PruebaPersona) para él
}
