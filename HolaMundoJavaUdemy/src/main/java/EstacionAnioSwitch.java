public class EstacionAnioSwitch {
    public static void main(String args[]) {
        var mes = 11;
        var estacion = "Estacion desconocida";

        switch (mes) {
            case 1, 2, 12:
                estacion = "Invierno";
                break;
            case 3, 4, 5:
                estacion = "Primavera";
                break;
            case 6, 7, 8:
                estacion = "Verano";
                break;
            case 9, 10, 11:
                estacion = "Otonio";
                break;
        }
        System.out.println("estacion = " + estacion);
    }
}
