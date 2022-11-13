import domain.Empleado;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.0);//si doy ctrl+space me sale el menu de lo que puedo meter en el ()
        System.out.println("empleado1 = " + empleado1);//Y si no meto en la clase Empleado el atributo de nombre,
        //no me imprimirá el nombre, solo el id y el sueldo, así que debo meter en el toString de Empleado el nombre
    }
}
