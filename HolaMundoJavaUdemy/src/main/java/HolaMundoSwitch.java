public class HolaMundoSwitch {
    public static void main(String args[]) {
        //con if solo se evaluan expresiones boolean, en switch se evaluan expresiones con tipos numericos o con tipo string
        //es recomendable switch cuando estoy creando menus
        var numero = 3;
        var numeroTexto = "valor desconocido";
        
        switch (numero) {
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default://no es necesario ponerlo, es como el else
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
