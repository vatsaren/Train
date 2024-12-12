import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		CharacterType type1 = CharacterTypeFactory.getCharacterType("воин", "орк", "танк", "1");
		CharacterType type2 = CharacterTypeFactory.getCharacterType("маг", "чнловек", "дд", "2");
		CharacterType type3 = CharacterTypeFactory.getCharacterType("охотник", "нежить", "дд", "3");
		CharacterType type4 = CharacterTypeFactory.getCharacterType("паладин", "человек", "хил", "1");
		CharacterType type5 = CharacterTypeFactory.getCharacterType("воин", "орк", "танк", "1");

		List<Character> characters = new ArrayList<>();

		characters.add(new Character(type1, "1", "2"));
		characters.add(new Character(type2, "2", "2"));
		characters.add(new Character(type3, "1", "3"));
		characters.add(new Character(type4, "5", "2"));
		characters.add(new Character(type5, "7", "2"));

		characters.forEach(Character::draw);

		System.out.println("количество созданных легковесов: " + CharacterTypeFactory.characterTypes.size());
	}
}