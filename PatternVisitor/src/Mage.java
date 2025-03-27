public class Mage implements IUnit {

	private int health = 100;
	private int armor = 2;
	private int magicResist = 3;
	private boolean isActiveMagicShield = false;


	@Override
	public void changeHealth(int health) {
		System.out.println("У мага было " + this.health + " здоровья");
		this.health = this.health - health;
		System.out.println("У мага стало " + this.health + " здоровья");
	}

	@Override
	public int getArmor() {
		return armor;
	}

	@Override
	public int getMagicResist() {
		return magicResist;
	}

	@Override
	public int getHealth() {
		return health;
	}

	public void setActiveMagicShield(boolean activeMagicShield) {
		isActiveMagicShield = activeMagicShield;
	}

	public boolean isActiveMagicShield() {
		return isActiveMagicShield;
	}

	@Override
	public void computeDamage(Visitor v, Damage damage) {
		String type = damage.getType() == DamageType.PHYSICAL ? " Физического" : " Магического";
		System.out.println("Попытка нанести магу " + damage.getDamage() + type + " урона");
		v.mageDamage(this, damage);
	}
}
