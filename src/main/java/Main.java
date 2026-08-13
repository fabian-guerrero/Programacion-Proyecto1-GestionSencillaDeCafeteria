import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    private static Cliente[] clientes = new Cliente[10];
    private static int numClientes = 0;

    private static Camarero[] camareros = new Camarero[10];
    private static int numCamareros = 0;

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println();
            System.out.println("==== CAFETERIA ====");
            System.out.println("1. Crear cliente");
            System.out.println("2. Crear camarero");
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
