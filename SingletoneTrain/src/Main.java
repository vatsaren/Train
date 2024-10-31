public class Main {
	public static void main(String[] args) {
		GodEmperor god1 = GodEmperor.getInstance("Я единственный бог император человечества!");
		GodEmperor god2 = GodEmperor.getInstance("Нет это я единственный бог император человечества!");
		System.out.println(god1);
		System.out.println(god2);

	}
}