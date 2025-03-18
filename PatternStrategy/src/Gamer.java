public class Gamer {

	private IStrategy context = new RockStrategy();
	private final String name;

	public Gamer(String name) {
		this.name = name;
	}

	public IStrategy getContext() {
		return context;
	}

	public void setContext(IStrategy context) {
		this.context = context;
	}

	public String getName() {
		return name;
	}
}
