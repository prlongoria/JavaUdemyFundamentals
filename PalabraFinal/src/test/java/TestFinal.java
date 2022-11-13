import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;//al poner final ya no le podré asignar otro valor más adelante
        System.out.println("miVariable = " + miVariable);

        //Persona.MY_CONSTANTE = 5; //esto no me deja hacerlo porque es una constante en la clase padre
        System.out.println("Mi constante: " + Persona.MY_CONSTANTE);

        final Persona persona1 = new Persona();//la variable persona1 es de tipo final y
        // no podré asignarle una nueva referencia
        persona1.setNombre("Juan");
        System.out.println("persona1 = " + persona1.getNombre());
        persona1.setNombre("Pepe");//así sí puedo cambiar el nombre, es decir lo que cambio aquí es
        // el valor del atributo nombre, no varío el objeto(su referencia) pero sí el contenido del objeto
        System.out.println("persona1 = " + persona1.getNombre());

    }
}
