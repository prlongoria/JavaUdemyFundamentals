package dominio;

//ENCAPSULAMIENTO: atributos privados a los que debo acceder con getter y setter

public class Persona {
    //atributos privados:
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    //constructor con argumentos:
    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    //getter para coger(recuperar su información) y setter para modificar los atributos privados de mi clase

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {//al ser boolean no es get sino is
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    //Método toString: permite imprimir el estado del objeto en cualquier momento con los valores de cada atributo
    //que agregue a dicho método toString:
    public String toString() {
        return "Persona [nombre: " + this.nombre + ", sueldo: " + this.sueldo + ", eliminado: " + this.eliminado + "]";
    }
}
