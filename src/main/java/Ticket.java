public class Ticket {
    private Cliente cliente;
    private Camarero camarero;
    private Producto[] productos;
    private final int max_productos = 10;
    private int numProductos;

    public Ticket(Cliente cliente, Camarero camarero){
        this.cliente = cliente;
        this.camarero = camarero;
        this.productos = new Producto[max_productos];
        this.numProductos = 0;
    }

    public void agregarProducto(Producto producto){
        if (numProductos < max_productos){
            productos[numProductos] = producto;
            numProductos++;
        }else{
            System.out.println("No se pueden agregar más productos.");
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < numProductos; i++){
            total += productos[i].getPrecio();
        }
        return  total;
    }

    public void mostrarTicket(){
        double totalTicket = calcularTotal();

        System.out.println("\nCAFETERÍA JAVA\n");
    }
}
