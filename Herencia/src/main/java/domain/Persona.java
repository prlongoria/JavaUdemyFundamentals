package domain;
//Los constructores son para poder crear distintos objetos de distintas formas (incializando
//los atributos que yo quiera a la hora de crear esos objetos

//Si el argumento es protected heredan las clases hijas (aumque estén en otro paquete), si es private no heredan las clases hijas
//si no indico nada (private o protected) será un argumento accesible sólo dentro de las clases que se encuentren en el mismo paquete
public class Persona {
    //atributos protected para que los puedan acceder las clases hijas
    protected String nombre;
    protected char genero;
    protected int edad;
    protected  String direccion;
    //constructor vacio para poder crear objetos de tipo persona sin necesidad de inicializar los atributos de esta clase:
    public Persona() {
    }
    //Constructor para inicializar sólo el atributo nombre:
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //Constructor completo (clic derecho generar constructor) para incializar todos los atributos al crear un objeto

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    //getter y setter:al hacerlo con el generate ya lo encapsula automáticamente, es decir, utiliza this en los setter:

    public String getNombre() {
        return this.nombre;//no es necesario el this, lo he puesto yo porque es buena práctica
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
//Ahora creo la clase Empleado en el mismo paquete
