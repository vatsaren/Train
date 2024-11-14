public class Main {
	public static void main(String[] args) {
		Orc swordOrk = new Orc(new Sword());
		Orc axeOrk = new Orc(new Axe());

		swordOrk.name();
		swordOrk.attack();
		swordOrk.block();

		axeOrk.name();
		axeOrk.attack();
		axeOrk.block();
	}
}