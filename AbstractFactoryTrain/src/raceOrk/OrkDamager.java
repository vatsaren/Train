package raceOrk;

import role.IDamager;

public class OrkDamager implements IDamager {

	@Override
	public void attack() {
		System.out.println("Орк атакует");
	}
}
