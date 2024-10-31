import director.Director;
import builder.TankBuilder;
import tank.Tank;

public class Main {
	public static void main(String[] args) {
		Director director = new Director();
		TankBuilder builder = new TankBuilder();
		director.constructBigTank(builder);
		Tank bigTank = builder.getResult();
		System.out.println("Мы построили большой танк:\n" + bigTank);

		director.constructSmallTank(builder);
		Tank smallTank = builder.getResult();
		System.out.println("Мы построили небольшой танк:\n" + smallTank);

		director.constructBtr(builder);
		Tank btr = builder.getResult();
		System.out.println("Мы построили небольшой танк:\n" + btr);

		//Также можно создать ещё один билдер, который будет отличаться от класса TankBuilder, но иметь тот же интерфейс IBuilder
	}
}