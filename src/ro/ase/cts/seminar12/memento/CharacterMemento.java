package ro.ase.cts.seminar12.memento;

public class CharacterMemento {
	
	String name;
	int hitPoints;
	
	public CharacterMemento(String name, int hitPoints) {
		this.name = name;
		this.hitPoints = hitPoints;
	}

	public String getName() {
		return name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

}
