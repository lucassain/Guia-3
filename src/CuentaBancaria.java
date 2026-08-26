public class CuentaBancaria {
    private  int id;
    String nombre;
    private int balance;


    public CuentaBancaria(String nombre, int id, int balance) {
        this.nombre = nombre;
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credito(int deposito){

        this.balance=balance+deposito;

        return balance;
    }

    /*b. El método débito que representa una sustracción de dinero de la cuenta.
          Este método debe devolver el balance luego de la operación.
          Si el dinero en la cuenta no es suficiente para cubrir la
          sustracción, se debe imprimir por pantalla un aviso sin
           permitir dicha sustracción.*/

    public int debito (int extraccion){

        if (extraccion>balance){
            System.out.println("Saldo insuficiente.");
        }else {
            this.balance=balance-extraccion;
        }

        return balance;
    }

    public void mostrarDetalles()
    {
        System.out.println("Id: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Balance: "+balance);
    }

}