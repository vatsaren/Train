public class Visitor {

	public void warriorDamage(Warrior unit, Damage damage) {
		int value = 0;
		if (damage.getType() == DamageType.MAGIC) {
			value = damage.getDamage() - unit.getMagicResist();
		} else {
			value = damage.getDamage() - unit.getArmor();
		}
		unit.changeHealth(Math.max(value, 0));
	}

	public void mageDamage(Mage unit, Damage damage) {
		int value = 0;
		if (damage.getType() == DamageType.MAGIC) {
			value = unit.isActiveMagicShield() ? 0 : damage.getDamage() - unit.getMagicResist();
			unit.setActiveMagicShield(false);
		} else {
			value = damage.getDamage() - unit.getArmor();
		}
		unit.changeHealth(Math.max(value, 0));
	}

	public void rogeDamage(Roge unit, Damage damage) {
		int value = 0;
		if (damage.getType() == DamageType.MAGIC) {
			value = unit.isActiveInvise() ? 0 : damage.getDamage() - unit.getMagicResist();
		} else {
			value = unit.isActiveInvise() ? 0 : damage.getDamage() - unit.getArmor();
		}
		unit.setActiveInvise(false);
		unit.changeHealth(Math.max(value, 0));
	}
}
