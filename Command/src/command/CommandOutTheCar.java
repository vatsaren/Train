package command;

import car.ICar;
import person.IPerson;

public class CommandOutTheCar extends BaseCommand {

	private ICar car;

	public CommandOutTheCar(IPerson person, ICar car) {
		super(person);
		this.car = car;
	}

	@Override
	public ICommand execute() {
		car.getOutTheCar();
		return null;
	}
}
