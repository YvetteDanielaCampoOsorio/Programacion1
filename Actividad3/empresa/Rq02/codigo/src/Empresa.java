import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Empresa {
    //Atributos
    private String nombre;
    private String direccion;
    private String nit;
    private Empleado[] listaEmpleado;
    private int cantidadEmpleados;
    private String empleadoEncontrado;
    private int posicionEmpleado;

    //Constructor
    public Empresa(String nombre, String direccion, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.listaEmpleado = new Empleado[50]; // Tamaño máximo de empleados
        this.cantidadEmpleados = 0;
        cargarDatos();
    }

    public void cargarDatos() {
        agrEmpleado(new Empleado("1", "Juan Pérez", "Gerente", "juan.perez@empresa.com", "1234567890", "2020-05-15"));
        agrEmpleado(new Empleado("2", "María López", "Analista", "maria.lopez@empresa.com", "0987654321", "2019-08-22"));
        agrEmpleado(new Empleado("3", "Carlos Ruiz", "Desarrollador", "carlos.ruiz@empresa.com", "1122334455", "2021-01-10"));
        agrEmpleado(new Empleado("4", "Ana Gómez", "Diseñador", "ana.gomez@empresa.com", "2233445566", "2018-07-30"));
        agrEmpleado(new Empleado("5", "Pedro Martínez", "Soporte", "pedro.martinez@empresa.com", "3344556677", "2012-03-05"));
    }

    public void registrarEmpresa() {
        JOptionPane.showMessageDialog(null,"No disponible por el momento");
    }

    public void agrEmpleado(Empleado empleado) {
        if (cantidadEmpleados < listaEmpleado.length) {
            listaEmpleado[cantidadEmpleados++] = empleado;
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más empleados.");
        }
    }

    public void agregarEmpleados() {
        // Cantidad de empleados a registrar
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados a registrar: "));

        // Registro de empleados
        for (int i = 0; i < n; i++) {
            if (cantidadEmpleados >= listaEmpleado.length) {
                JOptionPane.showMessageDialog(null, "No se pueden agregar más empleados, límite alcanzado '50 empleados'.");
                break; // Detener el registro si el límite se ha alcanzado
            }

            String id;
            while (true) {
                id = JOptionPane.showInputDialog("Ingrese el Id del empleado número " + (i + 1));
                if (idExiste(id)) {
                    JOptionPane.showMessageDialog(null, "El ID ingresado ya existe");
                } else {
                    break;
                }
            }

            String nombre = JOptionPane.showInputDialog("Ingrese nombre completo del Empleado");
            String puesto = JOptionPane.showInputDialog("Ingrese el puesto del empleado");
            String correo = JOptionPane.showInputDialog("Ingrese correo del Empleado");
            String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del empleado");
            String fechaContratacion = JOptionPane.showInputDialog("Ingrese fecha de contratación del empleado");

            // Crear nuevo empleado
            Empleado empleado = new Empleado(id, nombre, puesto, correo, telefono, fechaContratacion);
            agrEmpleado(empleado);
        }
    }

    // Metodo para verificar si el id existe
    private boolean idExiste(String id) {
        for (int i = 0; i < cantidadEmpleados; i++) {
            if (listaEmpleado[i].getId().equals(id)) {
                return true; // El id existe
            }
        }
        return false; // ID único
    }

    //Buscar empleados (2 metodos: actualizar y eliminar)
    public boolean buscar(String entradaId) {
        // Validar que no sea vacío
        if (entradaId == null || entradaId.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un ID válido.");
            return false;
        }

        // Buscar empleado
        for (int i = 0; i < listaEmpleado.length; i++) {
            if (listaEmpleado[i] != null && entradaId.equals(listaEmpleado[i].getId())) {
                empleadoEncontrado = listaEmpleado[i].toString();
                posicionEmpleado = i;
                System.out.println("Posición del empleado: " + i);
                return true; // Devuelve `true` si encontró el empleado
            }
        }

        // Si no se encontró el empleado
        JOptionPane.showMessageDialog(null, "No existe un empleado con el ID ingresado.");
        return false;
    }

    public void actualizarEmpleados() {
        String entradaId = JOptionPane.showInputDialog("Ingrese el ID del empleado a actualizar");

        if (!buscar(entradaId)) { // Verificar si el empleado existe antes de actualizar
            return;
        }

        JOptionPane.showMessageDialog(null, "Datos del empleado\n\n" + empleadoEncontrado);
        String actNombre = JOptionPane.showInputDialog(null, "Actualizar nombre:", "Entrada", JOptionPane.QUESTION_MESSAGE, null, null, listaEmpleado[posicionEmpleado].getNombreCompleto()).toString();
        String actPuesto = JOptionPane.showInputDialog(null, "Actualizar puesto:", "Entrada", JOptionPane.QUESTION_MESSAGE, null, null, listaEmpleado[posicionEmpleado].getPuesto()).toString();
        String actCorreo = JOptionPane.showInputDialog(null, "Actualizar correo:", "Entrada", JOptionPane.QUESTION_MESSAGE, null, null, listaEmpleado[posicionEmpleado].getCorreo()).toString();
        String actTelefono = JOptionPane.showInputDialog(null, "Actualizar teléfono:", "Entrada", JOptionPane.QUESTION_MESSAGE, null, null, listaEmpleado[posicionEmpleado].getTelefono()).toString();
        String actFechaContratacion = JOptionPane.showInputDialog(null, "Actualizar fecha de contratación:", "Entrada", JOptionPane.QUESTION_MESSAGE, null, null, listaEmpleado[posicionEmpleado].getFechaContratacion()).toString();

        listaEmpleado[posicionEmpleado].setNombreCompleto(actNombre);
        listaEmpleado[posicionEmpleado].setPuesto(actPuesto);
        listaEmpleado[posicionEmpleado].setCorreo(actCorreo);
        listaEmpleado[posicionEmpleado].setTelefono(actTelefono);
        listaEmpleado[posicionEmpleado].setFechaContratacion(actFechaContratacion);

        JOptionPane.showMessageDialog(null, "¡Empleado " + entradaId + " actualizado!\n\n" + listaEmpleado[posicionEmpleado].toString());
    }

    public void eliminarEmpleados() {
        String entradaId = JOptionPane.showInputDialog("Ingrese el ID del empleado a eliminar");

        if (!buscar(entradaId)) { // Verificar si el empleado existe antes de eliminar
            return;
        }

        for (int i = posicionEmpleado; i < listaEmpleado.length - 1; i++) {
            listaEmpleado[i] = listaEmpleado[i + 1]; // Desplazar elementos
        }
        listaEmpleado[listaEmpleado.length - 1] = null; // Eliminar último duplicado
        cantidadEmpleados--;

        JOptionPane.showMessageDialog(null, "¡Empleado eliminado!");
    }

    public void mostrarEmpleados() {
        // Verificar si hay empleados registrados
        boolean hayEmpleados = false;
        StringBuilder mensaje = new StringBuilder("Lista de Empleados:\n");

        for (int i = 0; i < listaEmpleado.length; i++) {
            if (listaEmpleado[i] != null) { // Evitar NullPointerException
                mensaje.append(listaEmpleado[i].toString()).append("\n----------------\n");
                hayEmpleados = true;
            }
        }

        if (!hayEmpleados) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
            return;
        }

        // Crear un JTextArea con el mensaje
        JTextArea textArea = new JTextArea(mensaje.toString(), 20, 40);
        textArea.setEditable(false); // Solo lectura

        // Agregar el JTextArea dentro de un JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Mostrar el JOptionPane con el JScrollPane
        JOptionPane.showMessageDialog(null, scrollPane, "Empleados Registrados", JOptionPane.INFORMATION_MESSAGE);
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

    public void salarioEmpleados() {
        // Calcular y mostrar el salario de cada empleado

        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Verificar si hay empleados registrados
        if (cantidadEmpleados == 0) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
            return;
        }

        StringBuilder mensaje = new StringBuilder("Lista de Empleados con ajuste salarial:\n\n");

        for (int i = 0; i < cantidadEmpleados; i++) {
            Empleado e = listaEmpleado[i]; // Obtener el empleado actual

            // Convertir la fecha de contratación (String) a LocalDate
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate fechaPasada = LocalDate.parse(e.getFechaContratacion(), formatter);

            // Calcular la diferencia en años
            int anosTranscurridos = Period.between(fechaPasada, fechaActual).getYears();
            double salarioActual = e.getSalario();
            double nuevoSalario = salarioActual; // Inicialmente sin cambios

            // Aplicar aumentos según los años en la empresa
            if (anosTranscurridos > 3 && anosTranscurridos <= 5) {
                nuevoSalario += salarioActual * 0.05; // Aumento del 5%
                mensaje.append("El empleado con ID ").append(e.getId())
                        .append(" tiene un aumento del 5% por ").append(anosTranscurridos)
                        .append(" años en la empresa. Nuevo salario: ").append(nuevoSalario)
                        .append("\n----------------\n");
            } else if (anosTranscurridos > 5 && anosTranscurridos <= 10) {
                nuevoSalario += salarioActual * 0.10; // Aumento del 10%
                mensaje.append("El empleado con ID ").append(e.getId())
                        .append(" tiene un aumento del 10% por ").append(anosTranscurridos)
                        .append(" años en la empresa. Nuevo salario: ").append(nuevoSalario)
                        .append("\n----------------\n");
            } else if (anosTranscurridos > 10) {
                nuevoSalario += salarioActual * 0.15; // Aumento del 15%
                mensaje.append("El empleado con ID ").append(e.getId())
                        .append(" tiene un aumento del 15% por ").append(anosTranscurridos)
                        .append(" años en la empresa. Nuevo salario: ").append(nuevoSalario)
                        .append("\n----------------\n");
            } else {
                mensaje.append("El empleado con ID '").append(e.getId())
                        .append("' tiene menos años de los requeridos en la empresa para un aumento. Su salario actual es: ")
                        .append(salarioActual).append("\n----------------\n");
            }
        }

        // Crear un JTextArea con el mensaje
        JTextArea textArea = new JTextArea(mensaje.toString(), 20, 40); // Filas y columnas iniciales
        textArea.setEditable(false); // Solo lectura

        // Agregar el JTextArea dentro de un JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Mostrar el JOptionPane con el JScrollPane
        JOptionPane.showMessageDialog(null, scrollPane, "Salarios de Empleados", JOptionPane.INFORMATION_MESSAGE);
    }

    public void empleadoCedula() {
        String entradaId = JOptionPane.showInputDialog("Id del empleado a consultar");

        buscar(entradaId);
        JOptionPane.showMessageDialog(null,empleadoEncontrado);
    }

    public void empleadoCargo() {
        String entradaCargo = JOptionPane.showInputDialog("Ingrese el cargo del empleado a consultar").trim();
        boolean encontrado = false; // Bandera

        // Buscar empleados con el cargo ingresado
        for (int i = 0; i < cantidadEmpleados; i++) {
            if (entradaCargo.equalsIgnoreCase(listaEmpleado[i].getPuesto().trim())) {
                JOptionPane.showMessageDialog(null, listaEmpleado[i].toString());
                encontrado = true; // Se encontró el empleado
            }
        }

        // Validar si no se encontró ningún empleado con ese cargo
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No existe un empleado con ese cargo.");
        }
    }

    public void reporteSalarios() {
        if (listaEmpleado.length == 0) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
            return;
        }

        // Inicializar con el primer empleado de la lista
        Empleado empleadoMayorSalario = listaEmpleado[0];
        Empleado empleadoMenorSalario = listaEmpleado[0];

        double mayor = empleadoMayorSalario.getSalario();
        double menor = empleadoMenorSalario.getSalario();

        // Encontrar el mayor y menor salario
        for (Empleado e : listaEmpleado) {
            if (e != null) {
                if (e.getSalario() > mayor) {
                    mayor = e.getSalario();
                    empleadoMayorSalario = e;
                }
                if (e.getSalario() < menor) {
                    menor = e.getSalario();
                    empleadoMenorSalario = e;
                }
            }
        }

        // Mostrar resultados
        JOptionPane.showMessageDialog(null, "El empleado con el salario más alto es:\n"
                + empleadoMayorSalario.toString() + "\n\nEl empleado con el salario más bajo es:\n"
                + empleadoMenorSalario.toString());
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
