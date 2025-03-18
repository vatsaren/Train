public class Main {
	public static void main(String[] args) {

		RockStrategy rock = new RockStrategy();
		ScissorsStrategy scissors = new ScissorsStrategy();
		PaperStrategy paper = new PaperStrategy();

		Gamer gamer1 = new Gamer("Vova");
		Gamer gamer2 = new Gamer("Pavel");
		Game game = new Game();

		System.out.println(game.game(gamer1, gamer2));
		gamer1.setContext(scissors);
		System.out.println(game.game(gamer1, gamer2));
		gamer1.setContext(paper);
		System.out.println(game.game(gamer1, gamer2));
	}
}