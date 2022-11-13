public class HolaMundo {
    public static void main(String args[]) {
        //System.out.println("Hola Mundo!");

        int miVariableEntera = 10;
        System.out.println(miVariableEntera);

        miVariableEntera = 5;//le doy nuevo valor a la variable que definí antes
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludo";
        System.out.println(miVariableCadena);

        //var es inferencia de tipos en Java: no necesito poner el tipo de variable para declararla
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Hasta Luego";
        System.out.println(miVariableCadena2);

        System.out.println(miVariableCadena2 + " " + miVariableCadena);

        //Valores permitidos al declarar variables:
        var miVariable = 1;
        var _miVariable = 1;
        var $miVariable = 1;
    }
}
