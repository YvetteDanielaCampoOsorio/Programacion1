import javax.swing.*;
import java.lang.reflect.array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        arrayList<Estudiantes> ListaEstudiantes = new ArrayList <>();

        int n = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de estudianes a registrar: "));

        for (int i = 0; i < n; i++){
            String id = JOptionPane.showInputDialog("ingrese el Id del estudiante");
            String nombre = JOptionPane.showInputDialog("ingrese nombre del estudiante");
            int edad =  Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad del estudiante"));
            String genero = JOptionPane.showInputDialog("ingrese el genero del estudiante");
            String alergias = JOptionPane.showInputDialog("ingrese las alergias del estudiante");
            String nombreAcudiente = JOptionPane.showInputDialog("ingrese nombre del acudiente del estudiante");
            String numeroContacto = JOptionPane.showInputDialog("ingrese numero de contacto del estudiante");
        }

        Estudiantes newEstudiantes = new Estudiantes(id, nombre, edad, genero, alergias, nombreAcuiente, numeroContacto);

        ListaEstudiantes.add(newEstudiantes);
    }
}