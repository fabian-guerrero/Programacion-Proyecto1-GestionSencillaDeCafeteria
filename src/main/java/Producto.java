public class Producto {
    protected String nombre;
    protected double precio;
    protected String categoria;
    private double precioConDescuento;
    private double porcentajeDescuento;

    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.precioConDescuento = 0;
        this.porcentajeDescuento = 0;
    }

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

    public String mostrarInformacion() {
        return "Nombre producto: " + nombre + " - Categoria: " + categoria + " - Precio: " + precio + "€";
    }

    public String mostrarInformacionTicket() {
        return nombre + " - " + precio + " €";
    }
}
