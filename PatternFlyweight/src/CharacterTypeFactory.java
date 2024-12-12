import java.util.HashSet;
import java.util.Set;

public class CharacterTypeFactory {

	public static Set<CharacterType> characterTypes = new HashSet<>();

	public static CharacterType getCharacterType(String className, String raceName, String roleName, String texture) {
		CharacterType type = findCharacter(className, raceName, roleName, texture);
		if (type != null) {
			return type;
		}
		type = new CharacterType(className, raceName, roleName, texture);
		characterTypes.add(type);
		return type;
	}

	private static CharacterType findCharacter(String className, String raceName, String roleName, String texture) {
		for(CharacterType type: characterTypes) {
			if (characterIsCreated(className, raceName, roleName, texture, type)) {
				return type;
			}
		}
		return null;
	}

	private static boolean characterIsCreated(String className, String raceName, String roleName, String texture, CharacterType type) {
		return className.equals(type.getClassName()) && raceName.equals(type.getRaceName())
			   && roleName.equals(type.getRoleName()) && texture.equals(type.getTexture());
	}
}
