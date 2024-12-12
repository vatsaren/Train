public class Character {

	private final CharacterType type;
	private String x, y;

	public Character(CharacterType type, String x, String y) {
		this.type = type;
		this.x = x;
		this.y = y;
	}

	public CharacterType getType() {
		return type;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public void draw() {
		StringBuilder drawer = new StringBuilder();
		drawer.append("Отрисовка персонажа рассы ").append(type.getRaceName()).append(" класса ").append(type.getClassName())
				.append(" с ролью ").append(type.getRoleName()).append("\n");
		drawer.append("Типа рисуется текстура ").append(type.getTexture()).append(" в координатах ")
				.append(x).append(".").append(y).append("\n");
		System.out.println(drawer.toString());
	}
}
