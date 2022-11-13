package domain;
//Una constante se define con public final static y se escribe en MAYUSCULAS
//usos de la palabra final y lo que significa:
public final class Persona {//esta clase no puede tener hijas
    public final static int MY_CONSTANTE = 1; //una variable con la palabra final debe ser static y será una constante
    // y debo definirla con mayúsculas y _ para separar las palabras

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public final void imprimir() {//este método no puede sobreescribirse en una clase hija
        System.out.println("Método Imprimir");
    }
}
