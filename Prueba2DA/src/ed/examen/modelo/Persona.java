package ed.examen.modelo;

/**
 * Esta sera nuestra clase persona
 * @author Ivan Cerrajeria
 * @author daw106
 * @since 1.0
 * @version 2.0.2
 * 
 *
 */
public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	/*
	 * Documentar y crear test unitario
	 * */
	
	/**
	 * Este seria el constructor de la clase persona con sus respectivos parametros
	 * @param dni Este es el dni de la persona
	 * @param nombre Este nos dira el nombre de la persona
	 * @param apellido1 Este nos dira el apellido de la persona
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	
	/**
	 * Este metodo lo que hara sera sacarnos el dni
	 * @return Nos devuelve el dni de la persona
	 */
	public String getDni() {
		return dni;
	}
	
	
	/*
	 * Documentar y crear test unitario
	 * */
	
	/**
	 * Aqui nos escribira el dni y sino lanzara la excepcion
	 * @param dni este es el dni de la persona
	 * @throws Exception y aqui nos devolvera una excepcion
	 */
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()-1))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	
	/**
	 * Este nos sacara el nombre de la persona
	 * @return nos devuelve el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	
	/**
	 * Aqui nos escrbira le nombre de la persona indicada.
	 * @param nombre este es el nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Este nos sacara el apellido de la persona
	 * @return nos devuelve el apellido de la persona
	 */
	public String getApellido1() {
		return apellido1;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Aqui lo que nos muestra es el apellido de la persona
	 * @param apellido1 este es el apellido de la persona
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
