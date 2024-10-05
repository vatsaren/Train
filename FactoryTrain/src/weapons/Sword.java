package weapons;

public class Sword implements IWeapon {

	@Override
	public void attack() {
		System.out.println("Удар мечом!");
	}

	@Override
	public void block() {
		System.out.println("Блок мечом!");
	}
}
