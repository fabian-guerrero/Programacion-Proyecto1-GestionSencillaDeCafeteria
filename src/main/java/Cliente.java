/**
 * Clase que representa a un cliente de la cafeteria.
 *
 * @author FabianGuerrero
 * @version 1.0
 */
public class Cliente {
    private String nombre;
    private String telefono;

    /**
     * Constructor para crear un cliente con nombre y telefono
     *
     * @param nombre    Nombre del cliente
     * @param telefono  Número de teléfono del cliente
     */
    public Cliente(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
