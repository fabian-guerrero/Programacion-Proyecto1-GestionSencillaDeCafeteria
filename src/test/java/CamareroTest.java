import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamareroTest {

    @Test
    void getNombre() {
        // Arrange
        Camarero camarero = new Camarero("Juan Jose", "0001");

        // Act
        String nombreCamarero = camarero.getNombre();

        //Assert
        assertEquals("Juan Jose", nombreCamarero);
    }

    @Test
    void getCodigoEmpleado() {
        Camarero camarero = new Camarero("Juan Jose", "0001");

        // Act
        String codigoEmpleado = camarero.getCodigoEmpleado();

        //Assert
        assertEquals("0001", codigoEmpleado);
    }
}