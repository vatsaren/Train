public class Roge implements IUnit {

	private int health = 100;
	private int armor = 3;
	private int magicResist = 0;
	private boolean isActiveInvise = false;


	@Override
	public void changeHealth(int health) {
		System.out.println("У роги было " + this.health + " здоровья");
		this.health = this.health - health;
		System.out.println("У роги стало " + this.health + " здоровья");
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

	public void setActiveInvise(boolean activeInvise) {
		isActiveInvise = activeInvise;
	}

	public boolean isActiveInvise() {
		return isActiveInvise;
	}

	@Override
	public void computeDamage(Visitor v, Damage damage) {
		String type = damage.getType() == DamageType.PHYSICAL ? " Физического" : " Магического";
		System.out.println("Попытка нанести роге " + damage.getDamage() + type + " урона");
		v.rogeDamage(this, damage);
	}
}
