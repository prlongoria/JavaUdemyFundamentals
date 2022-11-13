import domain.Cliente;

import java.time.LocalDate;
import java.util.Date;

public class TestCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan", 'M', 42, "Asturias", new Date(), true);
        System.out.println("cliente1 = " + cliente1);

        Cliente cliente2 = new Cliente("Karla", 'F', 42, "Asturias", new Date(), true);
        System.out.println("cliente2 = " + cliente2);
    }
}
