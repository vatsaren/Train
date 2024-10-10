package raceOrk;

import raceHuman.HumanDamager;
import raceHuman.HumanHealer;
import raceHuman.HumanTank;
import role.IDamager;
import role.IHealer;
import role.IRoleFactory;
import role.ITank;

public class OrkFactory implements IRoleFactory {
	@Override
	public ITank createTank() {
		return new OrkTank();
	}

	@Override
	public IHealer createHealer() {
		return new OrkHealer();
	}

	@Override
	public IDamager createDamager() {
		return new OrkDamager();
	}
}
