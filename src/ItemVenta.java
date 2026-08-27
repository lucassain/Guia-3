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
        System.out.println("Cantidas: "+cantidad);
        System.out.println("Precio Unitario: "+precioUnitario);
        System.out.println("Precio Total: "+precioTotal);
    }
}
