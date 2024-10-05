package weapons.factory;

import weapons.Axe;
import weapons.IWeapon;

public class AxeFactory extends WeaponFactory {
	@Override
	public IWeapon createWeapon() {
		return new Axe();
	}
}
