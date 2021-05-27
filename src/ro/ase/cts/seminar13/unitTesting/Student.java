package ro.ase.cts.seminar13.unitTesting;

public class Student {
	
	String nume;
	int varsta;
	int note[];
	
	public Student(String nume, int varsta, int[] note) {
		this.nume = nume;
		this.varsta = varsta;
		this.note = note;
	}

	public String getNume() {
		return nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public int[] getNote() {
		return note;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) throws StudentExceptionWrongValue {
		if(varsta < 0) 
			throw new StudentExceptionWrongValue("Only accepts pozitive values");
		this.varsta = varsta;
	}

	public void setNote(int[] note) {
		this.note = note;
	}
	
	
	
	
}
