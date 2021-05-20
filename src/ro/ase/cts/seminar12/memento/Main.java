package ro.ase.cts.seminar12.memento;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<CharacterMemento> saveList = new ArrayList<>();
		GameCharacter myCharacter = new GameCharacter("Toni", 100);
		saveList.add(myCharacter.generateMemento());
		myCharacter.bleed();
		System.out.println(myCharacter.getName() + " character hit points: " + myCharacter.getHitPoints());
		myCharacter.setMemento(saveList.get(0));
		System.out.println(myCharacter.getName() + " character hit points: " + myCharacter.getHitPoints());
	}

}
