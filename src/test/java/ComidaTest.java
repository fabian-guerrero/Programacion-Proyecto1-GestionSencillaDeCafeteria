import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComidaTest {
    Producto producto;

    @BeforeEach
    void crearProducto(){
        producto = new Comida("Bocadillo", 3.28,  true,"Comida");
    }

    @Test
    void mostrarInformacion() {
        // Act
        String mostrarProducto = "Nombre comida: Bocadillo - Es caliente: true - Categoria: Comida - Precio: 3.28€";

        //Assert
        assertEquals(mostrarProducto, producto.mostrarInformacion());
    }

    @Test
    void mostrarInformacionTicket() {
        // Act
        String mostrarProducto = "Bocadillo caliente - 3.28 €";

        //Assert
        assertEquals(mostrarProducto, producto.mostrarInformacionTicket());
    }
}