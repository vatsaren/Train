public interface IUnit {

	void changeHealth(int health);

	int getArmor();

	int getMagicResist();

	int getHealth();

	void computeDamage(Visitor v, Damage damage);
}
