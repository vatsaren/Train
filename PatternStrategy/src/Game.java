public class Game {

	public String game(Gamer gamer1, Gamer gamer2) {
		System.out.println(gamer1.getName() + " выбросил " + gamer1.getContext().execute().getName());
		System.out.println(gamer2.getName() + " выбросил " + gamer2.getContext().execute().getName());
		String result = "Ничья";
		if (gamer1.getContext().execute() == KMN.ROCK) {
			if (gamer2.getContext().execute() == KMN.SCISSORS) {
				result = "Победил " + gamer1.getName();
			}
			if (gamer2.getContext().execute() == KMN.PAPER) {
				result = "Победил " + gamer2.getName();
			}
		}

		if (gamer1.getContext().execute() == KMN.SCISSORS){
			if (gamer2.getContext().execute() == KMN.ROCK) {
				result = "Победил " + gamer2.getName();
			}
			if (gamer2.getContext().execute() == KMN.PAPER) {
				result = "Победил " + gamer1.getName();
			}
		}

		if (gamer1.getContext().execute() == KMN.PAPER){
			if (gamer2.getContext().execute() == KMN.ROCK) {
				result = "Победил " + gamer1.getName();
			}
			if (gamer2.getContext().execute() == KMN.SCISSORS) {
				result = "Победил " + gamer2.getName();
			}
		}
		return result;
	}
}
