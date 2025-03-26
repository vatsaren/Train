public class Main {
	public static void main(String[] args) {
		Person human = new Human();
		Person wrewolf = new Wrewolf();
		Person ork = new Ork();

		human.runLevel();
		System.out.println("----------------------------");
		wrewolf.runLevel();
		System.out.println("----------------------------");
		ork.runLevel();
	}
}