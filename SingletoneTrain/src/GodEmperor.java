public class GodEmperor {
	private static GodEmperor instance = null;
	private String text;

	private GodEmperor(String text) {
		this.text = text;
	}

	public static GodEmperor getInstance(String text) {
		if (instance == null) {
			instance = new GodEmperor(text);
		}
		return instance;
	}

	@Override
	public String toString() {
		return text;
	}
}
