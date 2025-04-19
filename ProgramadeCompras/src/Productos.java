public class Productos {
    //Argumentos, Nombre Producto. Precio

   private String nombreProducto;
   private int precio;



    // getters y setters.
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // constructores

    public Productos(String nombreProducto, int precio) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    //
    public String toString(){
        return nombreProducto + " $" + precio;
    }
    public void mostrarProductos(){
        Tienda tienda = new Tienda();
        Productos[] productos = tienda.getProductos();
        for (Productos p:productos) {
            System.out.printf("%-20s %10d\n", p.getNombreProducto(), p.getPrecio());
        }
    }
}
