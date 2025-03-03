import javax.swing.*;
import java.lang.reflect.array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Menu
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opccion" + "\n" +
                "1. Registrar estudiante" + "\n" +
                "2. Modificar estudiante" + "\n" +
                "3. Eliminar estudiante" + "\n" +
                "4. Mostrar lista de todos los estudiantes:" + "\n" +
                "5. Mostrar LIsta de todos los estudiantes mayores de 5 años:" + "\n"
        ));

        switch (numero) {
            case 1 -> System.out.println("El número es 1");
            case 2 -> System.out.println("El número es 2");
            case 3 -> System.out.println("El número es 3");
            case 4 -> System.out.println("El número es 4");
            case 5 -> System.out.println("El número es 3");
            default -> System.out.println("El número no es 1, 2 ni 3");

        }
    }
}