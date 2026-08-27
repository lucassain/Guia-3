import java.util.Scanner;

public class ItemVenta {
    private int id;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;


    public ItemVenta(int id, String descripcion, int cantidad, double precioUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public ItemVenta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    double precioTotal;

    public double calcularPrecioTotal(int cantidad,double precioUnitario){

        precioTotal=cantidad*precioUnitario;

        return precioTotal;
    }
    public void mostrarVenta(){

        System.out.println("ItemVenta: ");
        System.out.println("Id: "+id);
        System.out.println("Descripcion: "+descripcion);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Precio Unitario: "+precioUnitario);
        System.out.println("Precio Total: "+precioTotal);
    }

    Scanner entrada= new Scanner(System.in);

    public void cargarDatos (){

        System.out.println("Ingrese su id: ");
        this.id= entrada.nextInt();
        entrada.nextLine();

        System.out.println("Ingrese la descripcion: ");
        this.descripcion= entrada.nextLine();

        System.out.println("Ingrese la cantidad: ");
        this.cantidad= entrada.nextInt();

        System.out.println("Ingrese el precio unitario: ");
        this.precioUnitario= entrada.nextDouble();

        this.precioTotal=calcularPrecioTotal(cantidad, precioUnitario);
    }

    /*Permite al usuario ingresar una nueva cantidad y actualiza el atributo cantidad del ítem de venta.
     */

    public int actualizarCantidad (){
        System.out.print("Ingrese la nueva cantidad: ");
        this.cantidad=entrada.nextInt();

        return cantidad;
    }

    public double actualizarPrecioUnitario (){
        System.out.print("Ingrese el nuevo precio unitario: ");
        this.precioUnitario=entrada.nextDouble();

        return precioUnitario;
    }
}
