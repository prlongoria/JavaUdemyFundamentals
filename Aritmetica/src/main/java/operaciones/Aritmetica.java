package operaciones;

//Memoria HEAP es para almacenar los objetos y los atributos de la clase, la memoria STACK es para almacenar las variables locales

//atributos en las clases (this), argumentos en los métodos(se les puede asignar valor al llamar a su método)

//constructor vacío es para poder crear objetos de una clase sin inicializar valores
//constructor con argumentos es para que reciba argumentos para poder inicializar los valores desde el momento en que se crea mi objeto
public class Aritmetica {
    //declaro ATRIBUTOS de la clase:(no puedo usar var, debo usar int por tratarse de atributos de una clase)
    //cuando utilice estos atributos, es recomendable que use la palabra this para saber que estoy utilizando los
    //atributos de la clase y así distinguirlos de las variables
    int a; //valor por defaut es cero (si fuera String sería null)
    int b;

    //Constructor vacío:método que no recibe argumentos, sólo sirve para reservar espacio de memoria
    //este constructor vacío no necesito crearlo porque se hace por default, lo he puesto aqúi para ver cómo es
    public Aritmetica() {//Los atributos a y b tienen aquí los valores por defautl: 0
        System.out.println("Ejecutando constructor");
    }
    //OJO, SI METO YO UN CONSTRUCTOR CON ARGUMENTOS, EL VACIO YA NO SE CREA AUTOMATICAMENTE, TENDRÉ QUE CREARLO YO TAMBIÉN
    //sobrecarga de constructories(agrego más constructores)
    public  Aritmetica(int argumento1, int argumento2) {
        this.a = argumento1;//Indico que quiero que el atributo a de mi clase sea igual al argumento1 de mi constructor
        this.b = argumento2;
        System.out.println("Ejecutando constructor  con argumentos");
    }

    //defino metodos:
    public void sumar() { //void: el metodo no regresa nada
        int resultado = this.a + this.b; //variable local del método. Uso this para saber que estoy usando los atributos de mi clase
        System.out.println("resultado = " + resultado);
    }

    //método con retorno de int:
    public int sumarConRetorno() { //el método retorna un valor entero

        //return a + b;//mejor lo hago en una sola línea

        //también puedo hacerlo con this:
        return this.a + this.b;//así sé que estoy tratando con argumentos de esta clase y no con argumentos
    }

    //Método con retorno de entero pero con ARGUMENTOS:
    public  int sumarConArgumentos(int argumento1, int argumento2) {
        //modo 1:
        //a = argumento1;
        //b = argumento2;
        //return a + b;

        //modo 2:
        //return argumento1 + argumento2;

        //modo 3:asigno a a y b los argumentos del método sumarConArgumentos
        a = argumento1;
        b = argumento2;
        return sumarConRetorno();
    }

        public  int sumarConArgumentosYThis(int a, int b) {
            //Operador THIS: puede acceder a los ATRIBUTOS y MÉTODOS del objeto que se está ejecutando en ese momento:
            this.a = a;//en este caso  no necesito el this, pero mi código queda más claro porque me dice que estoy accediendo a estas variables de este método
            this.b = b;
            //This.a y this.b son atributos de mi clase, mientras que a y b son argumentos que estoy recibiendo en mi método
            return this.sumarConRetorno();
        }
}



