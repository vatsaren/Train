public class Main {
	public static void main(String[] args) {
		//Представим, что мы сиделка, и у нас есть только метод servePerson для обслуживания человека.
		//Старого человека мы не можем обслужить потому что не совпадают интерфейсы, поэтому был сделан адаптер,
		//позволяющий обслужить старого человека

		OldHuman oldHuman = new OldHuman();
		Adapter adapter = new Adapter(oldHuman);
		adapter.servePerson();
	}
}