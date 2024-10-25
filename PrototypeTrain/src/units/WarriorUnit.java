package units;

public class WarriorUnit extends Unit {

	public int rage;

	public WarriorUnit() {

	}

	public WarriorUnit(WarriorUnit warrior) {
		super(warrior);
		if (warrior != null) {
			this.rage = warrior.rage;
		}
	}

	@Override
	public Unit clone() {
		return new WarriorUnit(this);
	}

	@Override
	public String toString(){
		return String.format("Я воин %s уровня с %s ХП и %s ярости", level, health, rage);
	}
}
