public enum KMN {

	ROCK("Камень"),
	SCISSORS("Ножницы"),
	PAPER("Бумага");

	private final String name;

	KMN(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
