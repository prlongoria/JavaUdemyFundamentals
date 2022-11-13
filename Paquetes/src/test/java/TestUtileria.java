import mx.com.globalmentoring.Utileria;//el más recomendable
//import static mx.com.globalmentoring.Utileria.imprimir;//solo sirve para métodos static
public class TestUtileria {
    public static void main(String[] args) {
        Utileria.imprimir("Saludos, imprimiendo con el import normal");//mejor práctica

        //imprimir("Imprimiendo con el import del método static");//no necesito poner el nombre de la clase porque hice un
        // import del método, sólo sirve para static

        //NO recomendado lo siguiente pero posible:
        //mx.com.globalmentoring.Utileria.imprimir("imprimiendo sin imports, sólo con el nombre completamente calificado");
    }
}
