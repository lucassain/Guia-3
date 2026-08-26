import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int opcion;
        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("Ejercicio 1:");
            System.out.println("Ejercicio 2:");
            System.out.println("Ejercicio 3:");
            System.out.print("Ingrese una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: {
                    Empleado trabajador = new Empleado(47561896, "Lucas", "Sain", 100);
                    Empleado trabajador2 = new Empleado(4623564, "Franco", "Bidegain", 101);

                    trabajador.mostrarDetalles();
                    trabajador2.mostrarDetalles();

                    System.out.println("Ingrese un porcentaje: ");
                    trabajador.porcentaje=entrada.nextInt();

                    trabajador.aumentoSalarial(trabajador.salario, trabajador.porcentaje);

                    System.out.println("El nuevo salario de "+trabajador.nombre+ " es "+trabajador.salario);


                    System.out.println("El salario anual de "+ trabajador.nombre+" es "+trabajador.SalarioAnual(trabajador.salario));

                    break;
                }

                case 2:{
                    CuentaBancaria cuenta = new CuentaBancaria("Franco", 12345, 15000);

                    cuenta.credito(2500);
                    System.out.println("Balance actualizado: "+cuenta.getBalance());

                    cuenta.debito(1500);
                    System.out.println("Balance actualizado: "+cuenta.getBalance());

                    cuenta.debito(30000);

                    cuenta.mostrarDetalles();

                    break;
                }

            }
        }while (opcion != 0) ;

    }
}