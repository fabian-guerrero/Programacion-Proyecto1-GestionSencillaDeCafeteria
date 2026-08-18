import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {
    private Cliente cliente;
    private Camarero camarero;
    private Ticket ticket;

    @BeforeEach
    void crearElementosDeTicket(){
        cliente = new Cliente("Juan", "123456789");
        camarero = new Camarero("Carlos", "001");
        ticket = new Ticket(cliente, camarero);
    }

    @Test
    void calcularTotal() {
        Producto prod1 = new Producto("Galleta", 1.0, "Snack");
        Producto prod2 = new Comida("Bocadillo", 2.0, true, "Comida");
        Producto prod3 = new Bebida("Zumo", 3.0, "Grande", "Bebida");

        ticket.agregarProducto(prod1);
        ticket.agregarProducto(prod2);
        ticket.agregarProducto(prod3);

        // Act
        double total =  1.0 + 2.0 + 3.0;

        //Assert
        assertEquals(total, ticket.calcularTotal());
    }
}