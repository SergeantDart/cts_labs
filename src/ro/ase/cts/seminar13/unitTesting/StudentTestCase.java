package ro.ase.cts.seminar13.unitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.cts.seminar13.unitTesting.Student;

class StudentTestCase {
	
	Student student;
	static final String defaultName = "anonim";
	static final int defaultVarsta = 18;
	static final int defaultNote[] = {};

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
		student = new Student(defaultName, defaultVarsta, defaultNote);
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
	
	@Test
	void testStudentConstructorRightNotNull() {
		int grades[] = {7, 8, 9};
		Student student = null;
		try {
			student = new Student("Toni", 22, grades);
		}catch(Exception e) {
			fail("Constructor is not supposed to throw exceptions");
		}
		assertNotNull(student);
	}
	
	@Test(expect = StudentExceptionWrongValue.class) 
	void testStudentSetVarstaErrorCondition() {
		student.setVarsta(-1);
	}
}
