public class Main {
	public static void main(String[] args) {
		NewsPortal portal = new NewsPortal();
		User alex = new User("Alex");
		User ann = new User("Ann");
		User vova = new User("Vova");
		portal.manager.subscribe(alex);
		portal.manager.subscribe(ann);
		portal.manager.subscribe(vova);

		portal.createNews("Очень интерестная новост");

		portal.manager.unSubscribe(vova);
		portal.createNews("Не интерестная новость");
	}
}