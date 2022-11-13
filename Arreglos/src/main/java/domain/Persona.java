package domain;

public class Persona {
    private String nombre;

    //constructor:
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //getter y setter porque es atributo private:

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
    //Ahora debo crear una clase de prueba: TestArreglosObject
}
