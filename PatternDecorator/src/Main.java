import decorator.GausTankWrapper;
import decorator.Tank;

public class Main {
	public static void main(String[] args) {
		Tank tank = new Tank();
		System.out.println(tank.startEngine());
		System.out.println(tank.move());
		System.out.println(tank.fire());

		GausTankWrapper gausTank = new GausTankWrapper(tank);
		System.out.println(gausTank.startEngine());
		System.out.println(gausTank.move());
		System.out.println(gausTank.fire());
	}
}