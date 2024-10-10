package raceHuman;

import role.IDamager;

public class HumanDamager implements IDamager {

	@Override
	public void attack() {
		System.out.println("Человек атакует");
	}
}
