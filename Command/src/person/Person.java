package person;

public class Person implements IPerson {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
