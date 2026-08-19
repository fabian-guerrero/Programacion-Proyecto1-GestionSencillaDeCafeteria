/**
 * Clase que representa una comida que es un tipo/categoria de producto.
 * Añade el atributo esCaliente para indicar si es una comida fría o caliente.
 * Además sobrescribe el método mostrarInformación para incluir esta información adicional.
 *
 * @author FabianGuerrero
 * @version 1.0
 */
public class Comida extends Producto{
    private boolean esCaliente;

    /**
     * * Constructor para crear una comida con todos sus atributos.
     *
     * @param nombre        Nombre de la comida.
     * @param precio        Precio de la comida0
     * @param esCaliente    Temperatura de la comida (true si es calienta, false si es fría)
     * @param categoria     Categoria de la comida
     */
    public Comida(String nombre, double precio, boolean esCaliente, String categoria){
        super(nombre, precio, categoria);
        this.esCaliente = esCaliente;
    }

    public boolean isEsCaliente() {
        return esCaliente;
    }

    public void setEsCaliente(boolean esCaliente) {
        this.esCaliente = esCaliente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Comida{");
        sb.append("esCaliente=").append(esCaliente);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Devuelve la información del producto al momento de crearlo para verificarlo
     * @return La información del producto creado
     */
    @Override
    public String mostrarInformacion() {
        return "Nombre comida: " + nombre + " - Es caliente: " + esCaliente + " - Categoria: " + categoria + " - Precio: " + precio + "€";
    }

    /**
     * Devuelve la información del producto en el formato necesario para mostrarlo en el ticket
     * @return La información que debe mostrar el ticket
     */
    @Override
    public String mostrarInformacionTicket() {
        return nombre + (esCaliente ? " caliente" : " frio") + " - " + precio + " €";
    }
}
