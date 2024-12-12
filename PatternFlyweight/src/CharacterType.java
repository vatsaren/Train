public class CharacterType {

	private final String className;
	private final String raceName;
	private final String roleName;
	private final String texture;

	public CharacterType(String className, String raceName, String roleName, String texture) {
		this.className = className;
		this.raceName = raceName;
		this.roleName = roleName;
		this.texture = texture;
	}

	public String getClassName() {
		return className;
	}

	public String getRaceName() {
		return raceName;
	}

	public String getRoleName() {
		return roleName;
	}

	public String getTexture() {
		return texture;
	}
}
