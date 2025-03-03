import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Guarderia guarderia = new Guarderia("Mi Guardería", "Calle 123", "123456789");
        int opcion;
        //Menu
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opccion" +"\n" +
                    "1. Registrar estudiante" +"\n" +
                    "2. Modificar estudiante" +"\n" +
                    "3. Eliminar estudiante" +"\n" +
                    "4. Mostrar lista de todos los estudiantes:" +"\n" +
                    "5. Mostrar LIsta de todos los estudiantes mayores de - años:" +"\n" +
                    "6. Salir" +"\n"
            ));
            switch (opcion) {
                case 1:
                    guarderia.crearEstudiante();
                    break;
                case 2:
                    String idModificar = JOptionPane.showInputDialog("Ingrese la identificación del estudiante a modificar: ");
                    guarderia.modificarEstudiante(idModificar);
                    break;
                case 3:
                    String idEliminar = JOptionPane.showInputDialog("Ingrese la identificación del estudiante a eliminar: ");
                    guarderia.eliminarEstudiante(idEliminar);
                    break;
                case 4:
                    guarderia.mostrarListaEstudiantes();
                    break;
                case 5:
                    int edadMinima = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad minima del estudiantes a buscar: "));
                    guarderia.mostarListaEstudiantesMayores(edadMinima);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intente de nuevo.");
                    break;
            }
        } while (opcion != 6);
    }
}