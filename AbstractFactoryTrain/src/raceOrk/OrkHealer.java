package raceOrk;

import role.IHealer;

public class OrkHealer implements IHealer {
	@Override
	public void heal() {
		System.out.println("Орк лечит");
	}
}
