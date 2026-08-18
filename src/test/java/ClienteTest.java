import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void getNombre() {
        // Arrange
        Cliente cliente = new Cliente("Juan Pablo", "123 456 789");

        // Act
        String nombreCliente = cliente.getNombre();

        //Assert
        assertEquals("Juan Pablo", nombreCliente);    }

    @Test
    void getTelefono() {
        // Arrange
        Cliente cliente = new Cliente("Juan Pablo", "123 456 789");

        // Act
        String telefonoCliente = cliente.getTelefono();

        //Assert
        assertEquals("123 456 789", telefonoCliente);
    }
}