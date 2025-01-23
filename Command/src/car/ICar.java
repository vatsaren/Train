package car;

import person.IPerson;

public interface ICar {

	void drive(String destination);
	void getIntoTheCar(IPerson person);
	void getOutTheCar();
}
