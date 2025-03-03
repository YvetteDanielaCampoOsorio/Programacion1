public class Estudiantes {

        private String id;
        private String nombreCompleto;
        private int edad;
        private String genero;
        private String alergias;
        private String nombreAcudiente;
        private String numeroContacto;

        public Estudiantes(String id, String nombreCompleto,int edad, String genero, String alergias, String nombreAcudiente, String numeroContacto) {
            this.id = id;
            this.nombreCompleto = nombreCompleto;
            this.edad = edad;
            this.genero = genero;
            this.alergias = alergias;
            this.nombreAcudiente = nombreAcudiente;
            this.numeroContacto = numeroContacto;
        }

    @Override
    public String toString() {
        return "Estudiantes{" + "\n"+
                "id='" + id + '\'' + "\n"+
                ", nombreCompleto='" + nombreCompleto + '\'' + "\n"+
                ", edad=" + edad + "\n"+
                ", genero='" + genero + '\'' + "\n"+
                ", alergias='" + alergias + '\'' + "\n"+
                ", nombreAcudiente='" + nombreAcudiente + '\'' + "\n"+
                ", numeroContacto='" + numeroContacto + '\'' + "\n"+
                '}';
    }

    // Getters y setters
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }

        public String getNombreCompleto() {
            return nombreCompleto;
        }
        public void setNombreCompleto(String nombreCompleto) {
            this.nombreCompleto = nombreCompleto;
        }

        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getGenero() {
            return genero;
        }
        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getAlergias() {
            return alergias;
        }
        public void setAlergias(String alergias) {
            this.alergias = alergias;
        }

        public String getNombreAcudiente() {
            return nombreAcudiente;
        }
        public void setnombreAcudiente(String nombreAcudiente) {
            this.nombreAcudiente = nombreAcudiente;
        }

        public String getNumeroContacto() {
            return numeroContacto;
        }
        public void setNumeroContacto(String numeroContacto) {
            this.numeroContacto = numeroContacto;
        }
    }
