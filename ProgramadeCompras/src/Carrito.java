import java.util.ArrayList; // Importa la biblioteca de ArrayList.

public class Carrito {
    public static Object totalcarrito; // Crea la clase

    // Crea el objeto ArrayList.
    private ArrayList<Productos> productosEnCarrito; // Crea un Array Privado del tipo Productos ( Clase Productos)
    // Guarda los datos en al variable productosEnCarrito.

    public Carrito(){
        productosEnCarrito= new ArrayList<>();
    } // constructor de la istancia ProductosEnCarrito.

    // metodos
    // Agregar Productos al carrito.

    public void agregarProductosAlCarrito (Productos productos){
 productosEnCarrito.add(productos);
        System.out.println(" =================================================================");
        System.out.println(" ====Se ha Agregado: " + productos + " a su carrito de Compras====");
        System.out.println(" =================================================================");
    }
    // mostrar carrito
    public void mostrarCarrito(){
        if (productosEnCarrito.isEmpty()) {
            System.out.println("=======================================");
            System.out.println("========El carrito esta Vacio==========");
            System.out.println("=======================================");
            return;
        }
        System.out.println("==================================");
        System.out.println("=====Productos en el Carrito======");
        System.out.println("==================================");
        int i=1;
        for (Productos p:productosEnCarrito) {
            System.out.printf("%d. %-20s $%d\n", i, p.getNombreProducto(), p.getPrecio());
            i++;
        }
        System.out.println("==================================");
        System.out.println("======Gracias Por Su Compra=======");
        System.out.println("==================================");
    }
    //Metodo que suma el total de los productos en el carrito.
    public int totalCarrito(){
        int total=0;
        for (Productos p:productosEnCarrito){
            total= total+p.getPrecio();
        }
        return total;
    }

    public void vaciarCarrito() {
        productosEnCarrito.clear();
        System.out.println(" =====================================================");
        System.out.println(" ============El carrito ha sido vaciado.==============");
        System.out.println(" =====================================================");
    }




}
