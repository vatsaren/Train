package raceOrk;

import role.ITank;

public class OrkTank implements ITank {
	@Override
	public void protect() {
		System.out.println("Орк защищает");
	}
}
