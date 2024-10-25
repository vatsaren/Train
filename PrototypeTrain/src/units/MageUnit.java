package units;

public class MageUnit extends Unit {

	public int mana;

	public MageUnit() {

	}

	public MageUnit(MageUnit warrior) {
		super(warrior);
		if (warrior != null) {
			this.mana = warrior.mana;
		}
	}

	@Override
	public Unit clone() {
		return new MageUnit(this);
	}

	@Override
	public String toString(){
		return String.format("Я маг %s уровня с %s ХП и %s маны", level, health, mana);
	}
}
