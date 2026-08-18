import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BebidaTest {
    Producto producto;

    @BeforeEach
    void crearProducto(){
        producto = new Bebida("Café", 1.85,  "mediano","Bebida");
    }

    @Test
    void mostrarInformacion() {
        // Act
        String mostrarProducto = "Nombre bebida: Café - Tamaño: mediano - Categoria: Bebida - Precio: 1.85€";

        //Assert
        assertEquals(mostrarProducto, producto.mostrarInformacion());
    }

    @Test
    void mostrarInformacionTicket() {
        // Act
        String mostrarProducto = "Café mediano - 1.85 €";

        //Assert
        assertEquals(mostrarProducto, producto.mostrarInformacionTicket());
    }
}