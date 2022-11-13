package palabraThis;
//los constructores reservan espacio de memoria

//En java sólo puede haber 1 clase public por archivo, el resto se utilizan dentro de esta clase o del mismo paquete
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");//meto los argumentos
        System.out.println("persona = " + persona);
        System.out.println("persona nombre: " + persona.nombre);
        System.out.println("persona apellido: " + persona.apellido);

    }
}

class Persona {
    //super(); esto es una llamada implícita al constructor de la clase padre (clase Object), pero esta línea no la
    //pongo porque ya está por defecto
    String nombre;
    String apellido;

    //constructor:
    Persona(String nombre, String apellido) {
        //inicializo los atributos de la clase:
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this: " + this);//imprime el objeto persona(su ubicacion en memoria),
        //que es el objeto que está ejecutando en este momento (en el que se llama al constructor)
        new Imprimir().imprimir(this);//estoy creando un nuevo objeto y mando llamar al método imprimir
    }
}

class Imprimir {
    public void  imprimir(Persona persona) {
        System.out.println("persona desde imprimir = " + persona);
        System.out.println("impresion del objeto actual (this) = " + this);
    }
}
