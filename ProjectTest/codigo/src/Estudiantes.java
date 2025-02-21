private class Estudiantes {
	
    class Estudiantes {
		private String id;
		private String nombreCompleto;
		private int edad;
		private String genero;
		private String alergias;
		private String nombreAcudinte;
		private String numeroContacto;

	public Estudiantes(String id, String nombreCompleto,int edad, String genero, String alergias, String nombreAcudinte, String numeroContacto) {
		this.id = id;
		this.nombreCompleto = nombreCompleto;
		this.edad = edad;
		this.genero = genero;
		this.alergias = alergias;
		this.nombreAcudiente = nombreAcudiente;
		this.numeroContacto = numeroContacto;
		}
		
	public String toString(){
		return "nombre => " +nombre + "\n"
		
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

	public String getEdad() {
		return edad;
	}

		public void setEdad(String edad) {
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
