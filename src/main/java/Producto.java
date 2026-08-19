/**
 * Clase que representa un producto genérico.
 * Cada producto tiene un nombre, precio y categoria
 * También puede tener un porcentaje de descuento y un precio actualizado con ese descuento aplicado
 * Implementa la interfaz Descontable
 *
 * @author FabianGuerrero
 * @version 1.0
 */

public class Producto implements Descontable{
    protected String nombre;
    protected double precio;
    protected String categoria;
    private double precioConDescuento;
    private double porcentajeDescuento;

    /**
     * Constructor para crear un producto con nombre, precio y categoria
     *
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     * @param categoria Categoria del producto
     */
    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.precioConDescuento = 0;
        this.porcentajeDescuento = 0;
    }

    /**
     * Aplica un descuento al producto basándonos en el precio original y el porcentaje que le indiquemos.
     *
     * @param porcentaje Porcentaje de descuento aplicar
     * @return Precio actualizado del producto con el descuento
     */
    public double aplicarDescuento(double porcentaje) {
        this.porcentajeDescuento = porcentaje;
        double precioActualizado = precio * (1 - porcentaje / 100);
        setPrecioConDescuento(precioActualizado);
        return precioActualizado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecioConDescuento() {
        return precioConDescuento;
    }

    public void setPrecioConDescuento(double precioConDescuento) {
        this.precioConDescuento = precioConDescuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Producto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", categoria='").append(categoria).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**
     * Devuelve la información del producto al momento de crearlo para verificarlo
     * @return La información del producto creado
     */
    public String mostrarInformacion() {
        return "Nombre producto: " + nombre + " - Categoria: " + categoria + " - Precio: " + precio + "€";
    }

    /**
     * Devuelve la información del producto en el formato necesario para mostrarlo en el ticket
     * @return La información que debe mostrar el ticket
     */
    public String mostrarInformacionTicket() {
        return nombre + " - " + precio + " €";
    }
}
