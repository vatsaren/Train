package units;

public abstract class Unit {

	public int health;
	public int level;

	public Unit() {

	}

	public Unit(Unit unit) {
		if (unit != null) {
			this.health = unit.health;
			this.level = unit.level;
		}
	}

	public abstract Unit clone();
}
