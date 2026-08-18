import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {
    Producto producto;

    @BeforeEach
    void crearProducto(){
        producto = new Producto("Galleta", 2.0, "Snack");
    }

    @Test
    void aplicarDescuento() {
        // Act
        double precioFinal = producto.aplicarDescuento(10);

        //Assert
        assertEquals(1.80, precioFinal);
    }

    @Test
    void mostrarInformacion() {
        // Act
        String mostrarProducto = "Nombre producto: Galleta - Categoria: Snack - Precio: 2.0€";

        //Assert
        assertEquals(mostrarProducto, producto.mostrarInformacion());
    }
}