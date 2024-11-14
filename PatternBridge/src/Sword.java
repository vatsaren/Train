
public class Sword implements IWeapon {

	@Override
	public String getNameWeapon() {
		return "мечь";
	}

	@Override
	public String getAttackName() {
		return "удар мечом";
	}

	@Override
	public String getBlockName() {
		return "блок мечом";
	}
}
