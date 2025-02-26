private class Empleado {

    class Empleado {
        private String id;
        private String nombreCompleto;
        private String puesto;
        private String correo;
        private String telefono;
        private String fechaContratacion;

        public Empleado(String id, String nombreCompleto, String puesto, String correo, String telefono, String fechaContratacion) {
            this.id = id;
            this.nombreCompleto = nombreCompleto;
            this.puesto = puesto;
            this.correo = correo;
            this.telefono = telefono;
            this.fechaContratacion = fechaContratacion;
        }

        // Getters y setters
        public String getId() {
            return id;
        }

        public String getNombreCompleto() {
            return nombreCompleto;
        }

        public void setNombreCompleto(String nombreCompleto) {
            this.nombreCompleto = nombreCompleto;
        }

        public String getPuesto() {
            return puesto;
        }

        public void setPuesto(String puesto) {
            this.puesto = puesto;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getFechaContratacion() {
            return fechaContratacion;
        }

        public void setFechaContratacion(String fechaContratacion) {
            this.fechaContratacion = fechaContratacion;
        }
    }