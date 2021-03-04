package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Persona;

class PersonaTest {

	
	Persona p = new Persona ("123456789Z","Ivan","Cerrajeria");
	@Test
	void testPersonaStringStringString() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDni() {
		assertEquals("123456789Z", p.getDni());
	}

	@Test
	void testSetDni() {
		try {
			p.setDni("00000000N");
		} catch (Exception e) {																										
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("00000000N", p.getDni());
		
		
		//ESTO SERIA PARA HACER UN CHIBATO SIRVE PARA SABER SI PASA POR LA Exception e
		boolean exceptionLanzada= false;
		try {
			p.setDni("000000000");
			
		} catch (Exception e) {
			exceptionLanzada= true;
			// TODO Auto-generated catch block
			
		}
		assertEquals(true,exceptionLanzada);
	}

	@Test
	void testGetNombre() {
		assertEquals("Ivan", p.getNombre());

	}

	@Test
	void testSetNombre() {
		p.setNombre("Juan");
		assertEquals(p.getNombre(), "Juan");
	}

	@Test
	void testGetApellido1() {
		assertEquals("Jimenez", p.getApellido1());
	}

	@Test
	void testSetApellido1() {
		p.setApellido1("Jimenez");
		assertEquals(p.getApellido1(), "Jimenez");
	}

}
