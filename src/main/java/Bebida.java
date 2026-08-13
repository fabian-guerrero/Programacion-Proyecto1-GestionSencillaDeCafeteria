public class Bebida extends Producto{
    private String tamano;

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

    @Override
    public String mostrarInformacion(){
        return "Nombre bebida: " + nombre + " - Tamaño: " + tamano + " - Categoria: " + categoria + " - Precio: " + precio + "€";
    }
}
