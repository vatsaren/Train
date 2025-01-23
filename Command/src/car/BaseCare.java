package car;

import person.IPerson;

public class BaseCare implements ICar {

	protected String destination;
	protected IPerson driver;
	protected String name;

	public BaseCare(String name) {
		this.name = name;
	}

	@Override
	public void getIntoTheCar(IPerson person) {
		if (person != null) {
			driver = person;
			System.out.println(driver.getName() + " сел в машину " + name);
		}
	}

	@Override
	public void getOutTheCar() {
		if (driver != null) {
			System.out.println(driver.getName() + " вышел из машины " + name);
			driver = null;
		}
	}

	@Override
	public void drive(String destination) {
		this.destination = destination;
		System.out.println(driver.getName() + " едет на " + name + " в " + destination);
	}
}
