public class Empleado {

    /*Modele el objeto Empleado que posee las siguientes características, dni, nombre, apellido y salario. El
mismo debe contar con la posibilidad de calcular el salario anual. A su vez se requiere otro método que
permita aumentar el salario dependiendo del porcentaje que se le pase por parámetro. Considere crear un
método que facilite imprimir por pantalla las características del objeto de la siguiente forma:
Empleado[dni=?, nombre=?, apellido=?, salario=?]*/

    long dni;
    String nombre;
    String apellido;
    double salario;

    public Empleado (long dni, String nombre, String apellido, double salario){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;
    }

    double salarioAnual;

    public double SalarioAnual(double salario) {

        salarioAnual=salario*12;

        return salarioAnual;
    }

    /*otro método que
    permita aumentar el salario dependiendo del porcentaje que se le pase por parámetro.*/

    int porcentaje;
    public double aumentoSalarial (double salario, int porcentaje){

        double aumento=salario*((double)porcentaje/100);
        this.salario=salario+aumento;

        return salario;
    }

    public void mostrarDetalles ()
    {
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Dni: "+dni);
        System.out.println("Salario: "+salario);
    }
}
