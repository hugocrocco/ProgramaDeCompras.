public class Tienda {

    Productos[] productos;

    public Tienda() {
        productos = new Productos[10];
        productos[0] = new Productos("Jugo De Naranja", 5000);
        productos[1] = new Productos("Carne Molida", 5000);
        productos[2] = new Productos("Cocacola", 1900);
        productos[3] = new Productos("Masa Pizza", 3000);
        productos[4] = new Productos("Agua Mineral", 1200);
        productos[5] = new Productos("Sal", 800);
        productos[6] = new Productos("Cafe", 5000);
        productos[7] = new Productos("Azucar", 900);
        productos[8] = new Productos("Leche", 900);
        productos[9] = new Productos("Helado", 3500);

    }

    public Productos[] getProductos() {
        return productos;
    }


    //metotos
    // metodo mostrar Productos Disponibles

    public void mostrarProductos(){
        Tienda tienda = new Tienda();
        Productos[] productos = tienda.getProductos();
        for (Productos p:productos) {
            System.out.printf("%-20s %10d\n", p.getNombreProducto(), p.getPrecio());
        }
    }


}


