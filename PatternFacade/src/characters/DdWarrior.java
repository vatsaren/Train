package characters;

public class DdWarrior implements ICharacter {

	@Override
	public String getName() {
		return "дд воин";
	}

	public void attackBoss() {
		System.out.println("дд воин атакует босса");
	}

	public void burstOn() {
		System.out.println("дд воин включает бурсты");
	}
}
