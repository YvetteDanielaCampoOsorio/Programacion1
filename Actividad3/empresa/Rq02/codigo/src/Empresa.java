import javax.swing.*;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Empresa {

    //Atributos
    private String nombre;
    private String direccion;
    private String nit;
    //lista en de empleados
    private ArrayList<Empleado> ListaEmpleado = new ArrayList<>();
    private ArrayList<Empresa> ListaEmpresa = new ArrayList<>();


    //Constructor
    public Empresa(String nombre, String direccion, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;

        ListaEmpleado.add(new Empleado("1", "Juan Pérez", "Gerente", "juan.perez@empresa.com", "1234567890", "2020-05-15"));
        ListaEmpleado.add(new Empleado("2", "María López", "Analista", "maria.lopez@empresa.com", "0987654321", "2019-08-22"));
        ListaEmpleado.add(new Empleado("3", "Carlos Ruiz", "Desarrollador", "carlos.ruiz@empresa.com", "1122334455", "2021-01-10"));
        ListaEmpleado.add(new Empleado("4", "Ana Gómez", "Diseñador", "ana.gomez@empresa.com", "2233445566", "2018-07-30"));
        ListaEmpleado.add(new Empleado("5", "Pedro Martínez", "Soporte", "pedro.martinez@empresa.com", "3344556677", "2012-03-05"));
    }

    public static double obtenerSalarioPorCargo(String cargo) {
        switch (cargo.toLowerCase()) {
            case "gerente":
                return 9000000;
            case "analista":
                return 6000000;
            case "desarrollador":
                return 7000000;
            case "diseñador":
                return 4000000;
            case "soporte":
                return 2000000;
            default:
                return 0;
        }
    }

    public void registrarEmpresa() {
        //cantidad de empresas a registrar
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empresas a registrar: "));
        //registro empresas
        for (int i = 0; i < n; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la empresa numero " + (i + 1));
            String direccion = JOptionPane.showInputDialog("Ingrese la direccion de la empresa");
            String nit = JOptionPane.showInputDialog("Ingrese el nit de la empresa");
        }

        //se agrega la empresa
        Empresa empresa = new Empresa(nombre, direccion, nit);
        ListaEmpresa.add(empresa);
    }

    public void agregarEmpleados() {
        // Cantidad de empleados a registrar
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados a registrar: "));

        if (n > 50) {
            JOptionPane.showMessageDialog(null, "El límite de empleados a ingresar es '50'");
            return;
        }

        // Registro de empleados
        for (int i = 0; i < n; i++) {
            String id;

            // Validar que el ID no esté repetido
            while (true) {
                id = JOptionPane.showInputDialog("Ingrese el Id del empleado número " + (i + 1));

                if (idExiste(id)) {
                    JOptionPane.showMessageDialog(null, "El ID ingresado ya existe. Intente con otro.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    break;
                }
            }

            String nombre = JOptionPane.showInputDialog("Ingrese nombre completo del Empleado");
            String puesto = JOptionPane.showInputDialog("Ingrese el puesto del empleado");
            String correo = JOptionPane.showInputDialog("Ingrese correo del Empleado");
            String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del empleado");
            String fechaContratacion = JOptionPane.showInputDialog("Ingrese fecha de contratación del empleado");

            // Se agrega el empleado a la lista
            Empleado empleado = new Empleado(id, nombre, puesto, correo, telefono, fechaContratacion);
            ListaEmpleado.add(empleado);
        }
    }

    // Metodo para verificar si el id existe
    private boolean idExiste(String id) {
        for (Empleado e : ListaEmpleado) {
            if (e.getId().equals(id)) {
                return true; // El id existe
            }
        }
        return false; // id unico
    }

    public void mostrarEmpleados() {
        // Mostrar lista de empleados registrados
        StringBuilder mensaje = new StringBuilder("Lista de Empleados:\n");
        for (Empleado e : ListaEmpleado) {
            mensaje.append(e.toString()).append("\n----------------\n");
        }

        // Crear un JTextArea con el mensaje
        JTextArea textArea = new JTextArea(mensaje.toString(), 20, 40); // Filas y columnas iniciales
        textArea.setEditable(false); // Solo lectura

        // Agregar el JTextArea dentro de un JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Mostrar el JOptionPane con el JScrollPane
        JOptionPane.showMessageDialog(null, scrollPane, "Empleados Registrados", JOptionPane.INFORMATION_MESSAGE);
    }

    public void salarioEmpleados() {
        //Calcular y mostrar el salario de cada empleado

        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        StringBuilder mensaje = new StringBuilder("Lista de Empleados:\n\n");

        for (Empleado e : ListaEmpleado) {
            // Convertir el String a LocalDate
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate fechaPasada = LocalDate.parse(e.getFechaContratacion(), formatter);

            // Calcular la diferencia en años
            int añosTrascurridos = Period.between(fechaPasada, fechaActual).getYears();
            // Mostrar el resultado
            double salarioActual = e.getSalario();
            //Aumento 5%
            if (añosTrascurridos > 3 && añosTrascurridos <= 5) {
                mensaje.append("El salario del empleado con id: " + e.getId() + " tiene un aumento del 5% por tener " + añosTrascurridos + " años en la empresa, Nuevo salario: " + (salarioActual + (salarioActual * 0.05)) + "\n----------------\n");
            //Aumento 10%
            } else if (añosTrascurridos > 5 && añosTrascurridos <= 10) {
                mensaje.append("El salario del empleado con id: " + e.getId() + " tiene un aumento del 10% por tener " + añosTrascurridos + " años en la empresa, Nuevo salario: " + (salarioActual + (salarioActual * 0.10)) + "\n----------------\n");
            //Aumento 15%
            } else if (añosTrascurridos > 10) {
                mensaje.append("El salario del empleado con id: " + e.getId() + " tiene un aumento del 15% por tener " + añosTrascurridos + " años en la empresa, Nuevo salario: " + (salarioActual + (salarioActual * 0.15)) + "\n----------------\n");
            } else {
                mensaje.append("El empleado con id '"+ e.getId()+"' tiene menos años de los requeridos en la empresa para un aumento, su salario es de: " + salarioActual + "\n----------------\n");
            }
        }
        JTextArea textArea = new JTextArea(mensaje.toString(), 20, 40); // Filas y columnas iniciales
        textArea.setEditable(false); // Solo lectura

        // Agregar el JTextArea dentro de un JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Mostrar el JOptionPane con el JScrollPane
        JOptionPane.showMessageDialog(null, scrollPane, "Empleados Registrados", JOptionPane.INFORMATION_MESSAGE);
    }

    public void empleadoCedula() {
        int entradaId = Integer.parseInt(JOptionPane.showInputDialog("Id del empleado a consultar"));
        boolean encontrado = false;//bandera

        //Buscar el empleado
        for (Empleado e : ListaEmpleado) {
            if (entradaId == Integer.parseInt(e.getId())) {
                JOptionPane.showMessageDialog(null, e.toString());
                encontrado = true; // Se encontró el empleado
                break;
            }
        }

        // Validar si no existe el id
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No existe un empleado con el ID ingresado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void empleadoCargo() {
        String entradaCargo = JOptionPane.showInputDialog("Ingrese el cargo del empleado a consultar").trim();
        boolean encontrado = false; // Bandera para verificar si se encuentra el empleado

        // Buscar empleados con el cargo ingresado
        for (Empleado e : ListaEmpleado) {
            if (entradaCargo.equalsIgnoreCase(e.getPuesto().trim())) { // Comparar ignorando mayúsculas y minúsculas
                JOptionPane.showMessageDialog(null, e.toString());
                encontrado = true; // Se encontró el empleado
            }
        }

        // Validar si no se encontró ningún empleado con ese cargo
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No existe un empleado con ese cargo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void reporteSalarios() {
        // Inicializar con el primer empleado de la lista
        Empleado empleadoMayorSalario = ListaEmpleado.get(0);
        Empleado empleadoMenorSalario = ListaEmpleado.get(0);

        double mayor = empleadoMayorSalario.getSalario();
        double menor = empleadoMenorSalario.getSalario();

        // Encontrar el mayor y menor salario
        for (Empleado e : ListaEmpleado) {
            if (e.getSalario() > mayor) {
                mayor = e.getSalario();
                empleadoMayorSalario = e;
            }
            if (e.getSalario() < menor) {
                menor = e.getSalario();
                empleadoMenorSalario = e;
            }
        }

        // Mostrar resultados
        JOptionPane.showMessageDialog(null, "El empleado con el salario más alto es:\n" + empleadoMayorSalario.toString() + "\n El empleado con el salario más bajo es:\n" + empleadoMenorSalario.toString());
    }


    //Getter and Setter
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
}
