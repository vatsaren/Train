package command;

import car.ICar;
import person.IPerson;

public class CommandIntoTheCar extends BaseCommand {

	private ICar car;

	public CommandIntoTheCar(IPerson person, ICar car) {
		super(person);
		this.car = car;
	}

	@Override
	public ICommand execute() {
		car.getIntoTheCar(person);
		return null;
	}
}
