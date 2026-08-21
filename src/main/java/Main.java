import java.util.Scanner;

/**
 * Clase principal que contiene el menú para gestionar la cafetería.

 * @author FabianGuerrero
 * @version 1.0
 */

public class Main {
    private static Scanner sc = new Scanner(System.in);

    private static final int MAX_CLIENTES = 10;
    private static final int MAX_CAMAREROS = 10;
    private static final int MAX_PRODUCTOS = 20;

    private static Cliente[] clientes = new Cliente[MAX_CLIENTES];
    private static int numClientes = 0;

    private static Camarero[] camareros = new Camarero[MAX_CAMAREROS];
    private static int numCamareros = 0;

    private static Producto[] productos = new Producto[MAX_PRODUCTOS];
    private static int numProductos = 0;

    private static Ticket ticketNuevo = null;

    private static void cargarDatosPrueba() {
        // Crear clientes de prueba
        Cliente c1 = new Cliente("Ana López", "600123456");
        Cliente c2 = new Cliente("Juan Pérez", "611987654");
        Cliente c3 = new Cliente("María García", "622345678");
        // Añadirlos al array si hay espacio

        // Crear camareros de prueba
        Camarero cam1 = new Camarero("Carlos", "C01");
        Camarero cam2 = new Camarero("Laura", "C02");

        // Crear productos de prueba (incluyendo herencia)
        Producto p1 = new Bebida("Café", 1.80,  "mediano","Bebida");
        Producto p2 = new Comida("Bocadillo", 3.50,  true,"Comida");
        Producto p3 = new Bebida("Zumo", 2.20, "grande","Bebida");
        Producto p4 = new Producto("Galleta", 1.00, "Snack");
        Producto p5 = new Comida("Ensalada", 4.50,  false,"Comida");
        Producto p6 = new Bebida("Té", 1.50,  "pequeño","Bebida");

        // Añadir al array de productos disponibles
        Producto[] temp = {p1, p2, p3, p4, p5, p6};
        for (Producto p : temp) {
            if (numProductos < MAX_PRODUCTOS) {
                productos[numProductos++] = p;
            }
        }

        clientes[numClientes++] = c1;
        clientes[numClientes++] = c2;
        clientes[numClientes++] = c3;

        camareros[numCamareros++] = cam1;
        camareros[numCamareros++] = cam2;

        System.out.println("Datos de prueba cargados:");
        System.out.println("  - Clientes: " + numClientes);
        System.out.println("  - Camareros: " + numCamareros);
        System.out.println("  - Productos: " + numProductos);
    }

    public static void main(String[] args) {

        cargarDatosPrueba();

        int opcion;

        do {
            System.out.println();
            System.out.println("==== CAFETERIA ====");
            System.out.println("1. Crear cliente");
            System.out.println("2. Crear camarero");
            System.out.println("3. Crear producto");
            System.out.println("4. Crear ticket");
            System.out.println("5. Añadir productos al ticket");
            System.out.println("6. Aplicar descuento");
            System.out.println("7. Mostrar ticket");
            System.out.println("0. Salir \n");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                // =============================
                // CREAR CLIENTE
                // =============================
                case 1:
                    System.out.println();
                    System.out.println("--- NUEVO CLIENTE ---");

                    System.out.print("Nombre del nuevo cliente: ");
                    String nombreCliente = sc.nextLine();

                    System.out.print("Teléfono del nuevo cliente: ");
                    String telefonoCliente = sc.nextLine();

                    Cliente cliente = new Cliente(nombreCliente, telefonoCliente);
                    clientes[numClientes] = cliente;
                    numClientes++;
                    System.out.println("Cliente Creado: " + cliente.toString());


                    // Descomentar bucle for para verificar la lista de clientes creados
                    //for (int i = 0; i < numClientes; i++){
                    //    System.out.print(clientes[i].toString());
                    //}

                    break;

                // =============================
                // CREAR CAMARERO
                // =============================
                case 2:
                    System.out.println();
                    System.out.println("--- NUEVO CAMARERO ---");

                    System.out.print("Nombre del nuevo camarero: ");
                    String nombreCamarero = sc.nextLine();

                    System.out.print("Código de empleado: ");
                    String codigoEmpleado = sc.nextLine();

                    Camarero camarero = new Camarero(nombreCamarero, codigoEmpleado);
                    camareros[numCamareros] = camarero;
                    numCamareros++;
                    System.out.println("Camarero Creado: " + camarero.toString());

                    // Descomentar bucle for para verificar la lista de camareros creados
                    //for (int i = 0; i < numCamareros; i++){
                    //    System.out.print(camareros[i].toString());
                    //}

                    break;

                // =============================
                // CREAR PRODUCTO
                // =============================
                case 3:
                    System.out.println();
                    System.out.println("--- NUEVO PRODUCTO ---");

                    System.out.print("Nombre del nuevo producto: ");
                    String nombreProducto = sc.nextLine();

                    System.out.print("Precio del nuevo producto: ");
                    double precioProducto = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Categoria del nuevo producto: ");
                    String categoriaProducto = sc.nextLine();

                    System.out.print("Tipo (1.Producto, 2.Bebida, 3. Comida): ");
                    int tipoProducto = sc.nextInt();

                    sc.nextLine();

                    Producto productoNuevo = null;

                    switch (tipoProducto){
                        case 1:
                            productoNuevo = new Producto(nombreProducto, precioProducto, categoriaProducto);
                            break;

                        case 2:
                            System.out.print("Indique el tamaño del producto (pequeño, mediano o grande): ");
                            String tamano = sc.nextLine();
                            productoNuevo = new Bebida(nombreProducto, precioProducto, tamano, categoriaProducto);
                            break;

                        case 3:
                            System.out.print("¿Es un producto caliente? (si/no): ");
                            String caliente = sc.nextLine();
                            boolean esCaliente = false;
                            if (caliente.equals("si")){
                                esCaliente =  true;
                            }

                            productoNuevo = new Comida(nombreProducto, precioProducto, esCaliente, categoriaProducto);
                            break;

                        default:
                            System.out.print("El tipo de producto ingresado no es valido, crearemos un producto de tipo producto");
                            productoNuevo = new Producto(nombreProducto, precioProducto,categoriaProducto);
                    }

                    productos[numProductos] = productoNuevo;
                    numProductos++;
                    System.out.println("--- PRODUCTO CREADO ---\n" + productoNuevo.mostrarInformacion());

                    // Descomentar bucle for para verificar la lista de productos creados
                    //for (int i = 0; i < numProductos; i++){
                    //    System.out.print(productos[i].mostrarInformacion());
                    //    System.out.println();
                    //}

                    break;

                // =============================
                // CREAR TICKET
                // =============================
                case 4:
                    if (numClientes == 0) {
                        System.out.println("No hay clientes. Crea uno primero.");
                        return;
                    }

                    if (numCamareros == 0) {
                        System.out.println("No hay camareros. Crea uno primero.");
                        return;
                    }

                    System.out.println("\nClientes disponibles:");
                    for (int i = 0; i < clientes.length; i++) {
                        if (clientes[i] != null) {
                            System.out.println((i + 1) + ". Nombre: " + clientes[i].getNombre() + " - Teléfono: " + clientes[i].getTelefono());
                        }
                    }

                    System.out.print("Elige un numero de cliente: ");
                    int idCliente = sc.nextInt() - 1;
                    if (idCliente < 0 || idCliente >= numClientes) {
                        System.out.println("Cliente no válido.");
                        return;
                    }

                    System.out.println("\nCamareros disponibles:");
                    for (int i = 0; i < camareros.length; i++) {
                        if (camareros[i] != null) {
                            System.out.println((i + 1) + ". Nombre: " + camareros[i].getNombre() + " - Código Empleado: " + camareros[i].getCodigoEmpleado());
                        }
                    }

                    System.out.print("Elige un numero de camarero: ");
                    int idCamarero = sc.nextInt() - 1;
                    if (idCamarero < 0 || idCamarero >= numCamareros) {
                        System.out.println("Camarero no válido.");
                        return;
                    }

                    Cliente cli = clientes[idCliente];
                    Camarero cam = camareros[idCamarero];

                    ticketNuevo = new Ticket(cli, cam);

                    System.out.println("Ticket creado para el cliente " + cli.getNombre() + " atendido por el camarero " + cam.getNombre());

                    break;

                // =============================
                // AGREGAR PRODUCTO
                // =============================
                case 5:
                    if (numProductos == 0) {
                        System.out.println("No hay productos creados. Crea uno primero.");
                        return;
                    }

                    System.out.println("\nProductos disponibles:");
                    for (int i = 0; i < productos.length; i++) {
                        if (productos[i] != null) {
                            System.out.println((i + 1) + ". " + productos[i].mostrarInformacion());
                        }
                    }

                    System.out.print("\nElige el número del producto a añadir: ");
                    int idProducto = sc.nextInt() - 1;

                    Producto prod = productos[idProducto];
                    ticketNuevo.agregarProducto(prod);
                    System.out.println("--- PRODUCTO AÑADIDO ---\n" + prod.mostrarInformacion());

                    break;

                // =============================
                // APLICAR DESCUENTO
                // =============================
                case 6:
                    int cantidad = productos.length;
                    if (cantidad == 0) {
                        System.out.println("El ticket no tiene productos.");
                        return;
                    }

                    System.out.println("Productos en el ticket:");
                    for (int i = 0; i < cantidad; i++) {
                        if (ticketNuevo.getProductos(i) != null) {
                            System.out.println((i + 1) + ". " + ticketNuevo.getProductos(i).mostrarInformacion());
                        }
                    }

                    System.out.print("A que numero de producto aplicas el descuento: ");
                    int idDescuento = sc.nextInt() - 1;
                    if (idDescuento < 0 || idDescuento >= cantidad) {
                        System.out.println("Numero inválido.");
                        return;
                    }

                    Producto producto = ticketNuevo.getProductos(idDescuento);
                    System.out.print("Indica el porcentaje de descuento (solo número, sin '%'): ");
                    double porcentaje = sc.nextDouble();

                    double precioFinal = producto.aplicarDescuento(porcentaje);
                    producto.setPrecioConDescuento(precioFinal);

                    System.out.println("Descuento aplicado a " + producto.getNombre() + ". Precio final: " + precioFinal + " €");

                    break;

                // =============================
                // MOSTRAR TICKET
                // =============================
                case 7:
                    if (ticketNuevo == null) {
                        System.out.println("No hay ticket creado.");
                        return;
                    }

                    ticketNuevo.mostrarTicket();

                    break;

                // =============================
                // SALIR
                // =============================
                case 0:
                    System.out.println("Cerrando aplicación...");
                    break;

                default:
                    System.out.println("Opción no valida.");
            }

        }while (opcion != 0);
    }
}
