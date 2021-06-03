package ro.ase.cts.seminar14.unitTesting;

public abstract class AbstractStudent {
	
	String nume;
	int varsta;
	int note[];
	
	public abstract float computeAverage() throws StudentExceptionWrongValue;;

}
