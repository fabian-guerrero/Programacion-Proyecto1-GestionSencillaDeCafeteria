/**
 * Clase que representa a un camarero de la cafeteria.
 *
 * @author FabianGuerrero
 * @version 1.0
 */
public class Camarero {
    private String nombre;
    private String codigoEmpleado;

    /**
     * Constructor para crear un camarero de la cafeteria.
     *
     * @param nombre            Nombre del camarero
     * @param codigoEmpleado    Número de código de empleado del camarero
     */
    public Camarero(String nombre, String codigoEmpleado){
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Camarero{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", codigoEmpleado='").append(codigoEmpleado).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
