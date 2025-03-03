import javax.swing.*;
import java.util.ArrayList;

public class Guarderia {

    //Atributos
    private String nombre;
    private String direccion;
    private String nit;
    private ArrayList<Estudiantes> listaEstudiantes = new ArrayList<>();

    //Constructor
    public Guarderia(String nombre, String direccion, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;

        //base lista
        listaEstudiantes.add(new Estudiantes("1001", "Juan Pérez", 2, "M", "Ninguna", "Laura Pérez", "3001234567"));
        listaEstudiantes.add(new Estudiantes("1002", "María Gómez", 4, "F", "Polvo", "Carlos Gómez", "3109876543"));
        listaEstudiantes.add(new Estudiantes("1003", "Pedro Rodríguez", 7, "M", "Lácteos", "Ana Rodríguez", "3204567890"));
        listaEstudiantes.add(new Estudiantes("1004", "Luisa Fernández", 3, "F", "Ninguna", "Marta Fernández", "3156789012"));
        listaEstudiantes.add(new Estudiantes("1005", "Carlos López", 9, "M", "Polen", "Sofía López", "3183456789"));
    }

    //CRUD
    public void crearEstudiante(){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes que quiere registrar: "));

        for (int i = 0; i < n; i++){
            String identificacion;
            boolean idExiste;

            do {
                identificacion = JOptionPane.showInputDialog("Ingrese la identificación del estudiante: ");
                idExiste = existeIdentificacion(identificacion);
                if (idExiste) {
                    JOptionPane.showMessageDialog(null, "Esta identificación ya está registrada. Ingrese otra.");
                }

            } while (idExiste);
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante: "));
            String genero = JOptionPane.showInputDialog("Ingrese el genero: ");
            String alergias = JOptionPane.showInputDialog("Ingrese las alergias: ");
            String nombreAcudiente = JOptionPane.showInputDialog("Ingrese nombre del acudiente: ");
            String numeroAcudiente = JOptionPane.showInputDialog("Ingrese numero de contacto: ");

            Estudiantes newEstudiante = new Estudiantes(nombre, identificacion, edad, genero, alergias, nombreAcudiente, numeroAcudiente);
            listaEstudiantes.add(newEstudiante);
        }
    }

    private boolean existeIdentificacion(String id) {
        for (Estudiantes estudiante : listaEstudiantes) {
            if (estudiante.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void eliminarEstudiante(String idEstudianteEliminar){
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getId().equals(idEstudianteEliminar)) {
                listaEstudiantes.remove(i);
                JOptionPane.showMessageDialog(null, "Estudiante eliminado correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró un estudiante con esa identificación.");
    }

    public void modificarEstudiante(String idEstudianteBuscar) {
        // Buscar el estudiante por su ID
        for (Estudiantes estudiante : listaEstudiantes) {
            if (estudiante.getId().equals(idEstudianteBuscar)) {
                // Mostrar los valores actuales y permitir modificarlos
                String nombre = JOptionPane.showInputDialog(
                        "Ingrese el nuevo nombre del estudiante (Actual: " + estudiante.getNombreCompleto() + "): ",
                        estudiante.getNombreCompleto()
                );
                int edad = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Ingrese la nueva edad del estudiante (Actual: " + estudiante.getEdad() + "): ",
                                estudiante.getEdad()
                        )
                );
                String genero = JOptionPane.showInputDialog(
                        "Ingrese el nuevo género (Actual: " + estudiante.getGenero() + "): ",
                        estudiante.getGenero()
                );
                String alergias = JOptionPane.showInputDialog(
                        "Ingrese las nuevas alergias (Actual: " + estudiante.getAlergias() + "): ",
                        estudiante.getAlergias()
                );
                String nombreAcudiente = JOptionPane.showInputDialog(
                        "Ingrese el nuevo nombre del acudiente (Actual: " + estudiante.getNombreAcudiente() + "): ",
                        estudiante.getNombreAcudiente()
                );
                String numeroAcudiente = JOptionPane.showInputDialog(
                        "Ingrese el nuevo número de contacto (Actual: " + estudiante.getNumeroContacto() + "): ",
                        estudiante.getNumeroContacto()
                );

                // Actualizar los datos del estudiante solo si el usuario ingresó algo nuevo
                if (nombre != null && !nombre.isEmpty()) {
                    estudiante.setNombreCompleto(nombre);
                }
                if (edad > 0) { // Validar que la edad sea un número positivo
                    estudiante.setEdad(edad);
                }
                if (genero != null && !genero.isEmpty()) {
                    estudiante.setGenero(genero);
                }
                if (alergias != null && !alergias.isEmpty()) {
                    estudiante.setAlergias(alergias);
                }
                if (nombreAcudiente != null && !nombreAcudiente.isEmpty()) {
                    estudiante.setnombreAcudiente(nombreAcudiente);
                }
                if (numeroAcudiente != null && !numeroAcudiente.isEmpty()) {
                    estudiante.setNumeroContacto(numeroAcudiente);
                }

                JOptionPane.showMessageDialog(null, "Estudiante modificado correctamente.");
                return; // Salir del método después de modificar
            }
        }
        // Si no se encuentra el estudiante
        JOptionPane.showMessageDialog(null, "No se encontró un estudiante con esa identificación.");
    }

    public void mostrarListaEstudiantes() {
        StringBuilder mensaje = new StringBuilder("Lista de Estudiantes:\n");
        for (Estudiantes e : listaEstudiantes) {
            mensaje.append(e.toString()).append("\n----------------\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString(), "Estudiantes Registrados", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostarListaEstudiantesMayores(int edadMinima) {
        StringBuilder mensaje = new StringBuilder("Lista de Estudiantes Mayores de " + edadMinima + " años:\n");
        boolean hayEstudiantes = false;

        for (Estudiantes e : listaEstudiantes) {
            if (e.getEdad() >= edadMinima) {
                mensaje.append(e.toString()).append("\n----------------\n");
                hayEstudiantes = true;
            }
        }
        if (!hayEstudiantes) {
            mensaje.append("No hay estudiantes mayores de " + edadMinima + " años.");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString(), "Estudiantes Mayores", JOptionPane.INFORMATION_MESSAGE);
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Estudiantes> getListaEstudiantes() {
        return listaEstudiantes;
    }
    public void setListaEstudiantes(ArrayList<Estudiantes> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
}
