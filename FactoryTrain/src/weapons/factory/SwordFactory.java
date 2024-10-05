package weapons.factory;

import weapons.IWeapon;
import weapons.Sword;

public class SwordFactory extends WeaponFactory {

	@Override
	public IWeapon createWeapon() {
		return new Sword();
	}
}
