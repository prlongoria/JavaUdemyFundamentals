public class HolaMundo013 {
    public static void main(String args[]) {
        //Precedencia de operadores:hay una tabla de operadores que guarde en carpeta de java udemy
        var x = 5;
        var y = 10;
        var z = ++x + y--;//6 + 10 (preincremento, x ya es uno mas, postdecremento, y sigue valiendo 10)
        System.out.println("x = " + x);//6
        System.out.println("y = " + y);//9
        System.out.println("z = " + z);//16

        var resultado = 4 + 5 * 6 / 3;//miro la tabla para saber en que orden se ejecuta esto:la * y la / tienen la misma prioridad y es mas alta que la +, a igualdad de prioridad se ejecutara de izda a drcha: 4+((5*6)/3)=4+(30/3)=4+10=14
        System.out.println("resultado = " + resultado);

        var resultado2 = (4 + 5) * 6 / 3;//9*6/3=54/3=18
        System.out.println("resultado2 = " + resultado2);
    }
}
