package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Curso;
import ed.examen.modelo.Persona;

class CursoTest {

	Curso c = new Curso();

	@Test
	void testEliminarAlumno() {
		// parametro menor de 9 cifras

		boolean exceptionLanzada = false;
		try {
			c.eliminarAlumno("00");
		} catch (Exception e) {
			exceptionLanzada = true;
		}
		assertTrue(exceptionLanzada);

		// parametro de mas de 9 cifras
		exceptionLanzada = false;
		try {
			c.eliminarAlumno("123456789");
		} catch (Exception e) {
			exceptionLanzada = true;
			// TODO Auto-generated catch block
		}
		assertFalse(exceptionLanzada);

		// parametro mas de 9 cifras con alumno que no existe
		exceptionLanzada = false;
		int tamanioBefore = c.numeroAlumnos();
		try {
			c.eliminarAlumno("123456789"); // eliminar alumno no existe

		} catch (Exception e) {
			exceptionLanzada = true;
		}
		int tamanioAfter = c.numeroAlumnos();
		assertFalse(exceptionLanzada);
		assertEquals(tamanioBefore, tamanioAfter);

		// mas de 9 cifras con alumno que existe
		c.aniadirAlumno(new Persona("123456789", "Ivan", "Cerrajeria"));
		exceptionLanzada = false;
		tamanioBefore = c.numeroAlumnos();
		try {
			c.eliminarAlumno("123456789"); // eliminar alumno no existe

		} catch (Exception e) {
			exceptionLanzada = true;
		}
		tamanioAfter = c.numeroAlumnos();
		assertFalse(exceptionLanzada);
		assertEquals(tamanioBefore, tamanioAfter+1);

	}

	Persona p = new Persona();
	@Test
	void testAniadirAlumno() {
		
		c.aniadirAlumno(p);
		assertTrue(c.estaRegistrado(p.getDni()));
	}

	@Test
	void testEstaRegistrado() {
		c.aniadirAlumno(p);
		assertTrue(c.estaRegistrado(p.getDni()));
	}

	@Test
	void testCurso() {
		assertTrue(c.numeroAlumnos() == 0);
	}

	@Test
	void testNumeroAlumnos() {
		assertTrue(c.numeroAlumnos() == 1);
	}

}
