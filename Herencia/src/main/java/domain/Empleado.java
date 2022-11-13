package domain;
//Todas las clases que no lleven extends, serán hijas de la clase Object por default
//Los constructores no se heredan pero puedo accederlos a traves de super()

public class Empleado extends Persona{
    //debo decidir si esta clase de empleado va a tener hijas, sino las va a tener, puedo
    //poner sus atributos como private, y si las va a tener, deberán ser protected:
    private int idEmpleado;
    private double sueldo;
    private  static  int contadorEmpleado;

    //Constructor vacío:
    public Empleado() {
        //aquí hay una llamada por default a super(); por eso no necesito ponerlo yo
        this.idEmpleado = ++Empleado.contadorEmpleado;//inicializo el id de esta clase incrementándola, y como no quiero
        //modificarlo una vez inicializado, no utilizo para idEmpleado el método set, sólo el get
    }

    //Constructor:quiero inicializar el atributo nombre de la clase padre y el atributo sueldo de la clase hijo:

    public Empleado(String nombre, double sueldo) {
        //super(nombre);//así accedo al atributo nombre de la clase padre
        this();//Con esto quiero llamar al constructor vacío para que se inicialice, pero si hago esto, no puedo
        //inicializar los atributos de la clase padre con la palabra super(que es como lo tenía antes para el
        // ejercicio anterior. Lo que debo hacer entonces es:
        this.nombre = nombre;
        //aquí antes tenía la inicialización del contador que he puesto ahora en el constructor vacío
        this.sueldo = sueldo;//inicializo el atributo de la clas Empleado

    }
    //También podría escoger un constructor de la clase padre: por ejemplo, en este caso daria a generate y escojo el constructor completo del padre y nada de Empleado

    //public Empleado(String nombre, char genero, int edad, String direccion) {
    //    super(nombre, genero, edad, direccion);
    //}

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //generate stringBuilder que concatena con append en lugar de con + porque puedo modificar internamente los valores
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);//puedo poner o no this, mejor práctica ponerlo, pero para ello debo
        //// marcar los atributos como protected
        sb.append(", nombre=").append(this.nombre);//en vez de esta línea, podría poner:
        //sb.append(", Persona(").append(super.toString()).append(")");   y así mando a imprimir todos
        //los atributos del objeto persona ademas de los del objeto de la clase empleado
        sb.append('}');
        return sb.toString();//regresa la variable sb y un tipo Strign
    }
}
