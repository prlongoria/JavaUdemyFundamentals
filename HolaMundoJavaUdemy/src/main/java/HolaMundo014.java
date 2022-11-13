public class HolaMundo014 {
    public static void main(String args[]) {
        var condicion = false;
        if(condicion) {
            System.out.println("Condición verdadera");
        }
        else {
            System.out.println("Condición falsa");
       }

        var numero = 5;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "Numero uno";
        }
        else if (numero == 2) { //relaciona este if con el anterior y en cuanto encuentra la condición verdadera ya no ejecuta la siguiente, así el sistema trabaja menos que si pusiera otro if, ya que en ese caso revisaría condición a condición cada vez
            numeroTexto = "Numero dos";
        }
        else if (numero == 3) {
            numeroTexto = "Numero tres";
        }
        else if (numero == 4) {
            numeroTexto = "Numero cuatro";
        }
        //else { poner else es opcional, si no lo pongo se ejecutara esta linea 27 igualmente si no encuentra alguna de las condiciones anteriores
            numeroTexto = "Numero no econtrado";//incluso si no pongo esta linea me dira que es numero desconocido
        //}
        System.out.println(numeroTexto);
    }
}
