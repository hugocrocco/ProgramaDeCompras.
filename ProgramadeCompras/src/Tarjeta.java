public class Tarjeta {

    // atributos

    private int saldoTarjeta;
    private int maximoSaldo;

    // getter y setters.


    public int getSaldoTarjeta() {
        return saldoTarjeta;
    }

    public void setSaldoTarjeta(int saldoTarjeta) {
        this.saldoTarjeta = saldoTarjeta;
    }

    public int getMaximoSaldo() {
        return maximoSaldo;
    }


    public void setMaximoSaldo(int maximoSaldo) {
        this.maximoSaldo = maximoSaldo;
    }

        //constructor.


    public Tarjeta(int saldoTarjeta, int maximoSaldo) {
            this.saldoTarjeta = saldoTarjeta;
            this.maximoSaldo = maximoSaldo;
        }

        // metodos
        // cargar dinero
        public void cargarDinero(int monto){
            System.out.println("Debug -> Saldo actual: " + saldoTarjeta + ", Monto a cargar: " + monto + ", Máximo permitido: " + maximoSaldo);

            if (monto < 0) {
                System.out.println("El monto debe ser mayor a cero.");
            } else if (monto + saldoTarjeta > maximoSaldo) {
                System.out.println("El saldo superará el máximo permitido. Deposite menos dinero.");
            } else {
                saldoTarjeta += monto;
                System.out.println("Carga Exitosa, ha cargado $ " + monto + " y su saldo es $ " + saldoTarjeta);
            }
        }
        // mostrar saldo.
    public void mostrarSaldo(){
        System.out.println(" Su saldo es $" + saldoTarjeta + " y el saldo maximo es $ " + maximoSaldo);
    }


   // pagar carrito con la cuenta de la tarjeta.

    public boolean pagarCarrito(Carrito carrito) {
        int total = carrito.totalCarrito();

        if (total == 0) {
            System.out.println("El carrito está vacío. No hay nada que pagar.");
            return false;
        }

        if (saldoTarjeta >= total) {
            saldoTarjeta -= total;
            System.out.println(" Se descontaron $" + total + " de tu tarjeta.");
            System.out.println(" Saldo actual: $" + saldoTarjeta);
            return true;
        } else {
            System.out.println(" Saldo insuficiente. Tienes $" + saldoTarjeta + " y necesitas $" + total);
            return false;
        }
    }
    }

