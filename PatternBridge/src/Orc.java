
public class Orc {

	private final IWeapon weapon;

	public Orc (IWeapon weapon) {
		this.weapon = weapon;
	}

	public void name() {
		System.out.println("Я орк и у меня в руках " + weapon.getNameWeapon());
	}

	public void attack() {
		System.out.println("Орк длеает " + weapon.getAttackName());
	}

	public void block() {
		System.out.println("Орк делает " + weapon.getBlockName());
	}
}
