package ro.ase.cts.seminar13.unitTesting;

import java.util.ArrayList;

public class ManagementDepartment {
	
	ArrayList<Student> students;
	
	public ManagementDepartment() {
		students = new ArrayList<Student>();
	}

	public ManagementDepartment(ArrayList<Student> students) {
		super();
		this.students = students;
	}
	
	float computeScholarship(int studentIndex) {
		return 0.0f;
	}
}
