public class Comida extends Producto{
    private boolean esCaliente;

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

    @Override
    public String mostrarInformacion() {
        return "Nombre comida: " + nombre + " - Es caliente: " + esCaliente + " - Categoria: " + categoria + " - Precio: " + precio + "€";
    }

    @Override
    public String mostrarInformacionTicket() {
        return nombre + (esCaliente ? " caliente" : " frio") + " - " + precio + " €";
    }
}
