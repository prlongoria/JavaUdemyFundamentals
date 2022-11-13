package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica(); //aquí llamo al constructor vacío Aritmetica() para instanciar la clase y crear el objeto aritmetica1
        //aritmetica1.a = 3;//así asigno valor a las atributos de la clase
        //aritmetica1.b = 2;
        //aritmetica1.sumar();

        //Ahora quiero probar a utilizar el método con retorno de int de la clase:
        int resultado = aritmetica1.sumarConRetorno();//en este caso utilizo las mismas variables a y b, pero podría reservar espacio en el método y aqui meterle los valores que desee yo sumar
        System.out.println("resultado desde la prueba = " + resultado);

        //Llamo al método con argumentos:
        int resultado2 = aritmetica1.sumarConArgumentos(5, 8); //meto los valores que quiero
        System.out.println("resultado método con argumentos = " + resultado2);

        //llamo método con argumentos y this:
        int resultado3 = aritmetica1.sumarConArgumentosYThis(15, 2);
        System.out.println("resultado3 = " + resultado3);


        //quiero crear un objeto de tipo Aritmetica, mandando llamar al constructor vacío:
        Aritmetica aritmetica3 = new Aritmetica();
        System.out.println("aritmetica3 a = " + aritmetica3.a);//me dará valor 0
        System.out.println("aritmetica3 b = " + aritmetica3.b);//me dará valor 0

        //Llamo ahora al constructor con argumentos para iniciar desde el principio los atributos:
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a = " + aritmetica2.a);//me dará valor 5
        System.out.println("aritmetica2 b = " + aritmetica2.b);//me da valor 8

        //declaro variables locales del método main: solo se pueden utilizar en el método donde las defino
        int a = 10;//como es local puedo usar var si quisiera
        int b = 2;

    }
}
