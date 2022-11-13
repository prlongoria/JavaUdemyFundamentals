package domain;
//STATIC: atributos y métodos asociados a la clase. Su información se comparte entre los objetos de la clase.
//para acceder a ellos debo poner delante el nombre de la clase
//No static: atributos y métodos asociados al objeto. Su información no se comparte entre objetos.
//Los objetos son dinámicos, las clases estáticas.

public class Persona {
    //atributos:
    private  int idPersona;//atributo dinámico
    private String nombre;
    private static  int contadorPersonas;//variable que me permite contar cuantos objetos de tipo
    //persona se han creado ya que esta variable static se asocia con la clase y no con los objetos, así
    //cada vez que creemos un nuevo objeto, esta variable puedo ir incrementándola

    //Constructor:
    public Persona(String nombre) {
        this.nombre = nombre;
        //Para incrementar el contador por cada objeto nuevo:
        Persona.contadorPersonas++;//aqui no debo usar this sino Persona porque es atributo static
        //Asigno el nuevo valor a la variable idPersona:
        this.idPersona = Persona.contadorPersonas;//así se le asigna el valor incrementado
    }

    //getter y setter:

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    //clic drcho generate toSting:
    @Override //agrega información extra al método toString
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
