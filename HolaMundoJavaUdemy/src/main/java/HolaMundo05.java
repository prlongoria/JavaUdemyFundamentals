public class HolaMundo05 {
    //para poner un punto de ruptura basta con dar clic en el margen junto a los numeros
    public static void main(String args[]) {
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDouble = 100;
        System.out.println("numeroDouble = " + numeroDouble);
        
        var numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
        
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        //tengo un listado del valor de los caracteres unicode en mi carpeta de este curso
        char varChar = '\u0021';//es un var char que da el signo !
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33;//es el valor decimal del varchar !
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';//si no existiera el símbolo que quiero imprimr en mi teclado, lo puedo copiar de la tabla de unicode
        System.out.println("varCharSimbolo = " + varCharSimbolo);

        //los unicode tambien puedo asignarlos a variables var
        var varChar2 = '\u0021';//es un var char que da el signo !
        System.out.println("varChar2 = " + varChar2);

        var varCharDecimal2 = 33;//este es un valor tipo int porque lo asigno a una variable var, imprimira 33, no un simbolo
        System.out.println("varCharDecimal2 = " + varCharDecimal2);

        var varCharSimbolo2 = '!';//si no existiera el símbolo que quiero imprimr en mi teclado, lo puedo copiar de la tabla de unicode
        System.out.println("varCharSimbolo2 = " + varCharSimbolo2);
        
        //un tipo char se puede convertir a un tipo entero:
        int variableEnteraSImbolo = '!';//me imprime el valor 33 porque es el valor de este simbolo y porque lo he metido en una variable tipo int
        System.out.println("variableEnteraSImbolo = " + variableEnteraSImbolo);
    
        int letra = 'a';//imprime 97 que es el valor de ese unicode
        System.out.println("letra = " + letra);
        
        //tipos booleanos: también se les llama tipos bandera
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }

        boolean varBoolean2 = false;
        if (varBoolean2 == false) {
            System.out.println("La bandera es falsa");
        }

        var edad = 30;
        var esAdulto = edad >= 18;
        if (esAdulto) {
            System.out.println("Eres mayor de edad");
        }
        
    }
}
