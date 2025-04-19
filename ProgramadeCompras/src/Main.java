import java.util.Scanner;


public class Main {
    public static <string> void main(String[] args) {

        // menu vacio  primero importar scanner
        // crear el scanner
        Scanner scanner=new Scanner(System.in);
        // crear la variable opcion;
        int opcion;
       //instanciar las clases;
        //crear nueva tarjeta con saldo inicial.
        Tarjeta tarjeta=new Tarjeta(3000,50000);
        //crear nuevo articulo
        Productos producto=new Productos("Zapatillas",300);
        // crear tienda
         Tienda tienda=new Tienda();
         
         Carrito carrito=new Carrito();





        // crear  el do
        do {
            System.out.println("\n ======= Menu de compras========");
            System.out.println("1. Cargar dinero a la tarjeta");
            System.out.println("2. Comprar Articulos");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Salir del Programa");
            opcion= scanner.nextInt();
            // dentro del do crear el switch que sera el menu.
            switch (opcion){
                case 1:
                    System.out.println("Introduce Monto A Cargar:");
                    int monto = scanner.nextInt();  // recuerda tener scanner declarado
                    tarjeta.cargarDinero(monto);
                    break;

                case 2:
                    int opcionCompra;

                    do {
                        System.out.println("===============================================");
                        System.out.println("Bienvenido al Menu de Compras, elije una opcion");
                        System.out.println("===============================================");
                        System.out.println("1. Ver Articulos");
                        System.out.println("2. Comprar Articulos");
                        System.out.println("3. Ver Carrito de Compras");
                        System.out.println("4. Vaciar Carrito de Compras");
                        System.out.println("5. Confirmar Compra");
                        System.out.println("0. Volver Al Menu Principal");
                        opcionCompra= scanner.nextInt();
                        switch (opcionCompra)
                        {
                            case 1: // mostrar productos Disponibles
                                tienda.mostrarProductos();

                                break;
                            case 2: // comprar productos
                                String opcionProductos;
                                do  {
                                    System.out.println("\n =======Productos Disponibles====== ");
                                    //tienda.mostrarProductos();
                                    Productos[] productos = tienda.getProductos();
                                    for (Productos p:productos) {
                                        System.out.printf("%-20s %10d\n", p.getNombreProducto(), p.getPrecio());

                                    }
                                    System.out.println("\n Escribe el Nombre del producto para agregarlo al carrito o escribe Salir para terminar");
                                    opcionProductos=scanner.nextLine().trim();

                                    if (!opcionProductos.equalsIgnoreCase("Salir")){ // si lo que escribio no es salir, sigue ejecutando lo siguente.
                                        boolean encontrado=false;
                                        for (Productos p:productos){
                                            if(p.getNombreProducto().equalsIgnoreCase(opcionProductos)){
                                                carrito.agregarProductosAlCarrito(p);
                                                encontrado=true;
                                                break;
                                            }
                                        } if (!encontrado){
                                            System.out.println("Producto no encontrado, Busca Otro.");
                                        }
                                    }
                                } while (!opcionProductos.equalsIgnoreCase("salir"));
                                System.out.println("Saliendo del Carrito");
                               // carrito.mostrarCarrito();
                                System.out.println("El total de su compra es $" + carrito.totalCarrito());


                            case 3: // mostrar carrito
                                carrito.mostrarCarrito();
                                break;

                            case 4: // vaciar carrito
                                carrito.vaciarCarrito();
                                break;
                            case 5: // pagar carrito
                                if (tarjeta.pagarCarrito(carrito)) {
                                    carrito.vaciarCarrito(); // Se vacía solo si el pago fue exitoso
                                }
                                break;
                            case 0:
                                System.out.println("=======================");
                                System.out.println("===Volviendo al menu===");
                                System.out.println("=======================");
                                break;
                            default:
                                System.out.println("Opcion Incorrecta");

                        }

                    }
                    while (opcionCompra!=0);


                case 3:
                    // agregar metodo para mostrar saldo
                    tarjeta.mostrarSaldo();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta nuevamente.");
            }
        }
        while (opcion!=0);
        scanner.close();


    }
}