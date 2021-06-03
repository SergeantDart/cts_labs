package ro.ase.cts.seminar14.unitTesting;

public enum ScholarshipType {
	MERITOUS(500.0f),
	EXCELENCY(1000.0f);
	
	float quantum;
	
	ScholarshipType(float quantum) {
		this.quantum = quantum;
	}
	
	public float getQuantum() {
		return this.quantum;
	}
	
}
