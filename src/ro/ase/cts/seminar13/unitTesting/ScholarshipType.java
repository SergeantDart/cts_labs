package ro.ase.cts.seminar13.unitTesting;

public enum ScholarshipType {
	MERITOUS(500),
	EXCELENCY(1000);
	
	int quantum;
	
	ScholarshipType(int quantum) {
		this.quantum = quantum;
	}
	
	public int getQuantum() {
		return this.quantum;
	}
	
}
