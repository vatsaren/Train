package weapons.factory;

import weapons.IWeapon;

public abstract class WeaponFactory {

	public void useActions() {
		IWeapon weapon = createWeapon();
		weapon.attack();
		weapon.block();
	}

	public abstract IWeapon createWeapon();
}
