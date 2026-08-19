/**
 * Clase que representa una Bebida que es un tipo/categoria de producto.
 * Añade el atributo tamano para indicar el tamaño de la bebida.
 * Además sobrescribe el método mostrarInformación para incluir esta información adicional.
 *
 * @author FabianGuerrero
 * @version 1.0
 */
public class Bebida extends Producto{
    private String tamano;

    /**
     * Constructor para crear una bebida con sus atributos.
     *
     * @param nombre        Nombre de la bebida.
     * @param precio        Precio de la bebida.
     * @param tamano        Tamaño de la bebida.
     * @param categoria     Categoria de la bebida.
     */
    public Bebida(String nombre , double precio, String tamano, String categoria) {
        super(nombre, precio, categoria);
        this.tamano = tamano;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bebida{");
        sb.append("tamano='").append(tamano).append('\'');
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
    public String mostrarInformacion(){
        return "Nombre bebida: " + nombre + " - Tamaño: " + tamano + " - Categoria: " + categoria + " - Precio: " + precio + "€";
    }

    /**
     * Devuelve la información del producto en el formato necesario para mostrarlo en el ticket
     * @return La información que debe mostrar el ticket
     */
    @Override
    public String mostrarInformacionTicket() {
        return nombre + " " + tamano + " - " + precio + " €";
    }
}
