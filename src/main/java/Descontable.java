/**
 * Interfaz para aplicar un descuento a un producto.
 * Las clases que la utilicen deben tener su implementación del método aplicarDescuento para calcular
 * el precio luego de aplicar un porcentaje de descuento
 *
 * @author FabianGuerrero
 * @version 1.0
 */
public interface Descontable {
    double aplicarDescuento(double porcentaje);
}