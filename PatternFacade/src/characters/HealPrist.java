package characters;

public class HealPrist implements ICharacter {

	public void healTarget(ICharacter target) {
		if (target instanceof HealPrist)
		{
			System.out.println("хил лечит себя");
			return;
		}
		System.out.println("хил лечет цель -> " + target.getName());
	}

	public void healAll() {
		System.out.println("хил лечит всех");
	}

	@Override
	public String getName() {
		return "хил жрец";
	}
}
