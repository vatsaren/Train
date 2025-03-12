public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		car.pushGas();
		car.pushBrake();
		car.engineStart();
		car.engineStart();
		car.pushGas();
		car.pushGas();
		car.pushBrake();
		car.pushBrake();
		car.engineStop();
	}
}