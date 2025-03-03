import javax.swing.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //lista inicialisada
        ArrayList<Estudiantes> listaEstudiantes = new ArrayList<>();
        
        //registrar estudiantes
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes que quiere registrar: "));

        for (int i = 0; i < n; i++){
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
            String identificacion = JOptionPane.showInputDialog("Ingrese su identificacion: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante: "));
            String genero = JOptionPane.showInputDialog("Ingrese el genero: ");
            String alergias = JOptionPane.showInputDialog("Ingrese las alergias: ");
            String nombreAcudiente = JOptionPane.showInputDialog("Ingrese nombre del acudiente: ");
            String numeroAcudiente = JOptionPane.showInputDialog("Ingrese numero de contacto: ");

            Estudiantes newEstudiante = new Estudiantes(nombre, identificacion, edad, genero, alergias, nombreAcudiente, numeroAcudiente);

            listaEstudiantes.add(newEstudiante);
        }

        //mostrar lista
        StringBuilder mensaje = new StringBuilder("Lista de Estudiantes:\n");
        for (Estudiantes e : listaEstudiantes) {
            mensaje.append(e.toString()).append("\n----------------\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString(), "Estudiantes Registrados", JOptionPane.INFORMATION_MESSAGE);

    }
}