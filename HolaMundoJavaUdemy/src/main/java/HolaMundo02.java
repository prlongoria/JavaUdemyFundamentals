public class HolaMundo02 {
    public static void main(String args[]) {
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println(union);
        System.out.println("union = " + union);//cuando escribo soutv

        var i = 3;
        var j = 4;

        var suma = i + j;//realiza la suma
        System.out.println("suma = " + suma);

        System.out.println(i + j + usuario);//hace la suma y concatena la variable tipo String
        System.out.println(usuario + i + j); //concatena los 3 porque detecta antes la String que los int
        System.out.println(usuario + (i + j));// al poner () hace la suma y la concatena al string


    }
}
