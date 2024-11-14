
public class Axe implements IWeapon {

	@Override
	public String getNameWeapon() {
		return "топор";
	}

	@Override
	public String getAttackName() {
		return "удар топором";
	}

	@Override
	public String getBlockName() {
		return "блок топором";
	}
}
