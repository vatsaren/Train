public class Warrior implements IUnit {

	private int health = 100;
	private int armor = 10;
	private int magicResist = 5;


	@Override
	public void changeHealth(int health) {
		System.out.println("У воина было " + this.health + " здоровья");
		this.health = this.health - health;
		System.out.println("У воина стало " + this.health + " здоровья");
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

	@Override
	public void computeDamage(Visitor v, Damage damage) {
		String type = damage.getType() == DamageType.PHYSICAL ? " Физического" : " Магического";
		System.out.println("Попытка нанести воину " + damage.getDamage() + type + " урона");
		v.warriorDamage(this, damage);
	}
}
