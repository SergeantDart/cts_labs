package ro.ase.cts.seminar12.memento;

public class GameCharacter {
	
	String name;
	int hitPoints;
	
	public GameCharacter(String name, int hitPoints) {
		this.name = name;
		this.hitPoints = hitPoints;
	}
	
	public void bleed() {
		this.hitPoints -= 10;
	}
	
	public CharacterMemento generateMemento() {
		return new CharacterMemento(this.name, this.hitPoints);
	}
	
	public void setMemento(CharacterMemento memento) {
		this.name = memento.name;
		this.hitPoints = memento.hitPoints;
	}

	public String getName() {
		return name;
	}

	public int getHitPoints() {
		return hitPoints;
	}
	
	
	
	
}
