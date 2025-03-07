public class User implements IEventListener {

	private String name;

	public User(String name) {
		this.name = name;
	}

	@Override
	public void notify(String text) {
		System.out.println("Пользователь " + name + " получил новось:");
		System.out.println(text + "\n");
	}
}
