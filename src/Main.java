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

                case 3: {

                    int opcionesVenta;
                    ItemVenta nuevoItem= new ItemVenta();

                    do {
                        System.out.println("VENTA DE ITEMS");
                        System.out.println("Agregar ítem (1)");
                        System.out.println("Imprimir ítem (2)");
                        System.out.println("Ingresar nueva cantidad (3)");
                        System.out.println("Ingresar nueve precio unitario (4)");
                        System.out.println("Imprimir precio total (5)");
                        System.out.println("Salir del programa (0)");
                        System.out.print("Ingrese una opcion:");
                        opcionesVenta= entrada.nextInt();

                        switch (opcionesVenta){
                            case 0:{
                                System.out.println("Saliendo del programa...");
                                break;
                            }

                            case 1:{

                                nuevoItem.cargarDatos();

                                break;
                            }

                            case 2:{

                                nuevoItem.mostrarVenta();

                                break;
                            }

                            case 3:{

                                nuevoItem.actualizarCantidad();
                                System.out.println("Nueva cantidad: "+nuevoItem.getCantidad());

                                break;
                            }

                            case 4:{
                                nuevoItem.actualizarPrecioUnitario();
                                System.out.println("Nuevo precio unitario: "+nuevoItem.getPrecioUnitario());
                            }

                            case 5:{
                                System.out.println("Precio total: "+nuevoItem.calcularPrecioTotal(nuevoItem.getCantidad(), nuevoItem.getPrecioUnitario()));

                                break;
                            }
                        }

                    }while (opcionesVenta!=0);

                    System.out.println("Programa finalizado!");

                    break;
                }

            }
        }while (opcion != 0) ;

    }
}