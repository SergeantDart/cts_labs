package ro.ase.cts.seminar13.unitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class StudentTestCase {
	
	static Student student;
	static String defaultName = "anonim";
	static int defaultVarsta = 18;
	static int defaultNote[];
	static int NR_NOTE_DEFAULT = 3;
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
		defaultNote = new int[NR_NOTE_DEFAULT];
		defaultNote[0] = 8;
		defaultNote[1] = 9;
		defaultNote[2] = 10;
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
	
	@Test 
	void testStudentSetVarstaErrorCondition() {
		assertThrows(StudentExceptionWrongValue.class, new Executable() {

			@Override 
			public void execute() throws Throwable {
				student.setVarsta(-1);
			}
		});
	}
	
	@Test
	void testStudentGetVarstaRight() {
		int expectedValue = defaultVarsta;
		int actualValue = student.getVarsta();
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testComputeAverageErrorCondition() {
		try {
			student.setNote(null);
			assertThrows(StudentExceptionWrongValue.class, new Executable() {

				@Override 
				public void execute() throws Throwable {
					student.computeAverage();
				}
			});
		} catch (StudentExceptionWrongValue e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Test
	void testCalculMedieRightTwoDecimals() throws StudentExceptionWrongValue {
		float expectedValue = 9.00f;
		float actualValue = student.computeAverage();
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testSetNoteBoundaryCondition() {
		int invalidNote[] = new int[3];
		for(int i = 0; i < 2; i++) {
			invalidNote[i] =  5 + i;
		}
		invalidNote[2] = 20;
		assertThrows(StudentExceptionWrongValue.class, () -> {
			student.setNote(invalidNote);
		});
	}
}
