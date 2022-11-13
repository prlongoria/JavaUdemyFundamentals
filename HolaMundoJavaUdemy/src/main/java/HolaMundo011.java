public class HolaMundo011 {
    public static void main(String args[]) {
        var a = 11;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a >= 0 && a <= 10;
        if (resultado) {
            System.out.println("Está dentro de rango");
        }else {
            System.out.println("Fuera de rango");
        }

        var vacaciones = true;
        var diaDescanso = false;

        if(vacaciones || diaDescanso) {
            System.out.println("Puede ir al partido");
        }else {
            System.out.println("Está ocupado");
        }
    }
}
