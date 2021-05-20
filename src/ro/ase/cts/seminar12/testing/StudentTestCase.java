package ro.ase.cts.seminar12.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTestCase {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("beforeClass was called...");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownClass was called...");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp was called...");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("teadDown was called...");
	}

	@Test
	void testStudentConstructor() {
		String nume = "Toni";
		int varsta = 27;
		int note[] = {9, 9, 5, 10, 9};
		Student student = new Student(nume, varsta, note);
		/*if(student.nume.equals(nume)) {
			fail("Name is not correctly assigned in the constructor");
		}*/
		assertEquals(nume, student.getNume(), "Name not correctly assigned...");
		assertEquals(varsta, student.getVarsta(), "Age not correctly assigned...");
		assertEquals(note, student.getNote(), "Grades not correctly assigned...");
	}
}
