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
}