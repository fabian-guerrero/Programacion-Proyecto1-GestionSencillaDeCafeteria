/**
 * Clase que representa un ticket de venta de la cafeteria.
 * Contiene un cliente, un camarero y una lista de productos.
 *
 * @author FabianGuerrero
 * @version 1.0
 */
public class Ticket {
    private Cliente cliente;
    private Camarero camarero;
    private Producto[] productos;
    private final int max_productos = 10;
    private int numProductos;

    /**
     * Constructor para crear un ticket que debe incluir un cliente y un camarero
     * @param cliente   Cliente del ticket
     * @param camarero  Camarero del ticket
     */
    public Ticket(Cliente cliente, Camarero camarero){
        this.cliente = cliente;
        this.camarero = camarero;
        this.productos = new Producto[max_productos];
        this.numProductos = 0;
    }

    /**
     * Agrega productos al ticket si no se ha alcanzado el máximo.
     * Si se ha alcanzado el máximo muestra por que no se pudo agregar
     * @param producto  Producto que se va a agregar
     */
    public void agregarProducto(Producto producto){
        if (numProductos < max_productos){
            productos[numProductos] = producto;
            numProductos++;
        }else{
            System.out.println("No se pueden agregar más productos.");
        }
    }

    /**
     * Calcula el total del ticket de todos los productos sin incluir descuentos
     * @return La suma de los precios sin descuento
     */
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < numProductos; i++){
            total += productos[i].getPrecio();
        }
        return  total;
    }

    /**
     * Calcula el total final sumando los precios actualizados con descuento
     * @return Suma los precios actualizados con descuentos
     */
    public double calcularTotalFinal(){
        double total = 0;
        for (int i = 0; i < numProductos; i++) {
            if (productos[i].getPorcentajeDescuento() > 0){
                total += productos[i].getPrecioConDescuento();
            }else{
                total += productos[i].getPrecio();
            }
        }
        return total;
    }

    /**
     * Muestra por consola el ticket generado incluyendo:
     * - Cliente y camarero
     * - Lista de productos con el precio inicial
     * - Total del ticket con los precios iniciales
     * - Descuentos aplicados si es que los hay
     * - Total del ticket con descuentos si los hay
     */
    public void mostrarTicket(){
        double totalTicket = calcularTotal();

        System.out.println("\nCAFETERÍA JAVA\n");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Camarero: " + camarero.getNombre() + " - Código: "+ camarero.getCodigoEmpleado() +"\n");
        System.out.println("Productos:");
        for (int i = 0; i < numProductos; i++) {
            System.out.println((i + 1) + ". " + productos[i].mostrarInformacionTicket());
        }

        System.out.printf("\nTotal: "+ totalTicket  + " €\n");

        boolean hayDescuentos = false;
        for (int i = 0; i < numProductos; i++) {
            if (productos[i].getPorcentajeDescuento() > 0) {
                hayDescuentos = true;
                break;
            }
        }

        if (hayDescuentos) {
            for (int i = 0;i < numProductos;i++) {
                Producto prod = productos[i];
                if(prod.getPorcentajeDescuento() > 0){
                    System.out.println("\nDescuento aplicado a "+prod.getNombre() +" "+prod.getPorcentajeDescuento()+"%");
                    System.out.println("Precio final de " + prod.getNombre() + ": " + prod.getPrecioConDescuento() + "€");
                }
            }

            System.out.println("\nTotal Final: " + calcularTotalFinal() + " €");
        }
    }

    public Producto getProductos(int index) {
        if( index >= 0 && index < numProductos){
            return productos[index];
        }
        return null;
    }
}
