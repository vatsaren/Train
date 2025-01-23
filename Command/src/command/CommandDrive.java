package command;

import car.ICar;
import person.IPerson;

public class CommandDrive extends BaseCommand {

	protected ICar car;
	protected String destination;

	public CommandDrive(IPerson person, ICar car, String destination) {
		super(person);
		this.car = car;
		this.destination = destination;
	}

	@Override
	public ICommand execute() {
		car.drive(destination);
		return null;
	}
}
