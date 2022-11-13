import domain.Persona;

//dentro de un método static no puedo utilizar la palabra this
public class PersonaPrueba {
    public static void main(String[] args) {//este método no crea objetos de esta clase
        Persona persona1 = new Persona("Juan");
        //System.out.println("persona1 = " + persona1);//esto me da el id 1 y este nombre que le asigné al objeto

        Persona persona2 = new Persona("Karla");
        //System.out.println("persona2 = " + persona2);//el id ya será 2. OJO si no hubiera puesto static en los
        //atributos, el id no se incrementaría y seguiría siendo 1, porque se reiniciaría el valor con cada objeto

        imprimir(persona1);
        imprimir(persona2);

    }

    public static void imprimir(Persona persona) {//debe ser static si quiero llamarlo desde el método main
        System.out.println("persona = " + persona);
    }
}
