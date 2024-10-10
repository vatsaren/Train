package raceHuman;

import role.ITank;

public class HumanTank implements ITank {

	@Override
	public void protect() {
		System.out.println("Человек защищает");
	}
}
