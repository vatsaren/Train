package raceHuman;

import role.IHealer;

public class HumanHealer implements IHealer {

	@Override
	public void heal() {
		System.out.println("Человек лечит");
	}
}
