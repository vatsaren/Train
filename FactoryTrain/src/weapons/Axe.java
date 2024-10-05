package weapons;

public class Axe implements IWeapon {

	@Override
	public void attack() {
		System.out.println("Удар топором!");
	}

	@Override
	public void block() {
		System.out.println("Блок топором!");
	}
}
