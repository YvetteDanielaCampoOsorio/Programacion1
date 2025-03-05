import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Mi Empresa", "Calle 123", "123456789");

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("*****Seleccione una opcion*****\n\n 1. Registrar una empresa\n 2. Gestionar empleados\n 3. Calcular y mostrar el salario de cada empleado\n 4. Buscar empleado por cédula\n 5. Buscar empleado por cargo\n 6. Reporte de salarios mas Altos/Bajos\n 7. Salir del programa"));

            switch (opcion) {
                case 1:
                    empresa.registrarEmpresa();
                    break;

                case 2:
                    //Gestion de empleados
                    int opcionGestion;
                    do {
                        opcionGestion = Integer.parseInt(JOptionPane.showInputDialog("*****Gestion empleados*****\n\n 1. Agregar empleados\n 2. Actualizar empleados\n 3. Eliminar empleados\n 4. Mostrar empleados\n 5. Salir"));

                        switch (opcionGestion) {
                            case 1:
                                empresa.agregarEmpleados();
                                break;

                            case 2:
                                empresa.actualizarEmpleados();
                                break;

                            case 3:
                                empresa.eliminarEmpleados();
                                break;

                            case 4:
                                empresa.mostrarEmpleados();
                                break;

                            case 5:
                                //Salir de gestion
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "El dato ingresado no es valido");
                                break;
                        }

                    } while (opcionGestion != 5);
                    break;

                case 3:
                    empresa.salarioEmpleados();
                    break;

                case 4:
                    empresa.empleadoCedula();
                    break;

                case 5:
                    empresa.empleadoCargo();
                    break;

                case 6:
                    empresa.reporteSalarios();
                    break;

                case 7:
                    //Salir del programa
                    JOptionPane.showMessageDialog(null, "Hasta la próxima :)");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "El dato ingresado no es valido");
                    break;
            }

        } while (opcion != 7);
    }
}