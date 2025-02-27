import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* ejemplo de como crear un nuevo objeto en la clase Empleado
        Empleado newEmpleado = new Empleado("1245", "Julian", "Asesor", "julian@gmail.com", "3014578947", "02/02/2025");
        JOptionPane.showMessageDialog(null, newEmpleado, "Información", JOptionPane.INFORMATION_MESSAGE);
        */

        //lista en de empleados
        ArrayList<Empleado> ListaEmpleado = new ArrayList <>();
        //cantidad de empleados a registrar
        int n = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de empleados a registrar: "));
        //rregistro empleados
        for (int i = 0; i < n; i++){
            String id = JOptionPane.showInputDialog("ingrese el Id del empleado");
            String nombre = JOptionPane.showInputDialog("ingrese nombre complreto del Empleado");
            String puesto = JOptionPane.showInputDialog("ingrese el puesto del empleado");
            String correo = JOptionPane.showInputDialog("ingrese correo del Empleado");
            String telefono = JOptionPane.showInputDialog("ingrese el telefono del empleado");
            String fechaContratacion = JOptionPane.showInputDialog("ingrese fecha de contratacion del empleado");

            //se agrega el empleado a la clase
            Empleado empleado = new Empleado(id, nombre, puesto, correo, telefono, fechaContratacion);
            ListaEmpleado.add(empleado);
        }

        // Mostrar lista de empleados registrados
        StringBuilder mensaje = new StringBuilder("Lista de Empleados:\n");
        for (Empleado e : ListaEmpleado) {
            mensaje.append(e.toString()).append("\n----------------\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString(), "Empleados Registrados", JOptionPane.INFORMATION_MESSAGE);
    }
}