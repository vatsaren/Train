package raceHuman;

import role.IDamager;
import role.IHealer;
import role.IRoleFactory;
import role.ITank;

public class HumanFactory implements IRoleFactory {
	@Override
	public ITank createTank() {
		return new HumanTank();
	}

	@Override
	public IHealer createHealer() {
		return new HumanHealer();
	}

	@Override
	public IDamager createDamager() {
		return new HumanDamager();
	}
}
