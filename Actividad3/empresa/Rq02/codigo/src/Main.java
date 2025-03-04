import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Mi Empresa", "Calle 123", "123456789");

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("*****Seleccione una opcion*****\n\n 1. Registrar una empresa\n 2. Agregar empleados a la empresa\n 3. Mostar empleados registrados\n 4. Calcular y mostrar el salario de cada empleado\n 5. Buscar empleado por cédula\n 6. Buscar empleado por cargo\n 7. Reporte de salarios mas Altos/Bajos\n 8. Salir del programa"));

            switch (opcion) {
                case 1:
                    empresa.registrarEmpresa();
                    break;

                case 2:
                    empresa.agregarEmpleados();
                    break;

                case 3:
                    empresa.mostrarEmpleados();
                    break;

                case 4:
                    empresa.salarioEmpleados();
                    break;

                case 5:
                    empresa.empleadoCedula();
                    break;

                case 6:
                    empresa.empleadoCargo();
                    break;

                case 7:
                    empresa.reporteSalarios();
                    break;

                case 8 :
                    //Salir del programa
                    JOptionPane.showMessageDialog(null, "Hasta la próxima :)");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "El dato ingresado no es valido");
            }
        } while (opcion != 8);
    }
}