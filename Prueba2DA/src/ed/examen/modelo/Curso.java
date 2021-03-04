package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta sera nuestra clase curso
 * @author Ivan Cerrajeria
 * @author daw106
 * @since 1.0
 * @version 2.0.1
 * 
 *
 */
public class Curso {
	
	private List<Persona> listaAlumnos;

	
	/**
	 * Metodo  para eliminar un alumno introduciendo el dni
	 * @param dni numero identificacion de la persona que queremos eliminar
	 * @throws Exception cuando el dni no tiene 9 caracteres
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Con este metodo lo que haremos sera añadir un alumno
	 * Metodo para añadir persona al curso
	 * @param p persona que queremos añadir al curso
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	
	/**
	 * Basicamente lo que hara en este metodo sera ver si esta registrado el dni
	 * @param Aqui seleccionaremos el dni de la persona indicada
	 * @return y nos devolvera si se ha encontrado o no el dni
	 */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	
	/**
	 * Esto indica el curso en el que estan los alumnos
	 *  @author Ivan Este nos dira la lista de los alumnos
	 * @return no devuelve nada
	 */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	
	/**
	 * Estos son el numero de alumnos que tenemos dentro del curso
	 * @return nos devuelve el numero de alumnos que hay en la lista
	 * @author Ivan
	 */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
