import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {

        Tienda tienda = new Tienda();

       // tienda.mostrarProductos();
       // Productos[] productos = tienda.getProductos();
        Carrito carrito=new Carrito();
        Scanner scanner=new Scanner(System.in);
       // carrito.agregarProductosAlCarrito(); //para agregar producto manualmente

        // agregar con un menu
        // crear variable opcion
        String opcion;

       // crear el do
        do {
            System.out.println("\n =======Productos Disponibles====== ");
            //tienda.mostrarProductos();
            Productos[] productos = tienda.getProductos();
            for (Productos p:productos) {
                System.out.printf("%-20s %10d\n", p.getNombreProducto(), p.getPrecio());

            }
            System.out.println("\n Escribe el Nombre del producto para agregarlo al carrito o escribe Salir para terminar");
            opcion=scanner.nextLine().trim();

            if (!opcion.equalsIgnoreCase("Salir")){ // si lo que escribio no es salir, sigue ejecutando lo siguente.
                boolean encontrado=false;
                for (Productos p:productos){
                    if(p.getNombreProducto().equalsIgnoreCase(opcion)){
                        carrito.agregarProductosAlCarrito(p);
                        encontrado=true;
                        break;
                    }
                } if (!encontrado){
                    System.out.println("Producto no encontrado, Busca Otro.");
                }
            }




        } while (!opcion.equalsIgnoreCase("salir"));
        System.out.println("Saliendo del Carrito");

        carrito.mostrarCarrito();
        System.out.println("El total de su compra es $" + carrito.totalCarrito());
        scanner.close();


    }
}
