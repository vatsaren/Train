package characters;

public class RddMage implements ICharacter {

	@Override
	public String getName() {
		return "дд маг";
	}

	public void attackBoss() {
		System.out.println("дд маг атакует босса");
	}

	public void burstOn() {
		System.out.println("дд маг включает бурсты");
	}
}
