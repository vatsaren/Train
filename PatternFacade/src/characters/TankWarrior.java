package characters;

public class TankWarrior implements ICharacter {

	@Override
	public String getName() {
		return "воин танк";
	}

	public void protectCommand() {
		System.out.println("танк воин включает защиту команды");
	}

	public void tauntBoss() {
		System.out.println("танк воин провоцирует босса атаковать его");
	}
}
