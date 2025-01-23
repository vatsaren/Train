package command;

import person.IPerson;

public abstract class BaseCommand implements ICommand {

	protected IPerson person;

	public BaseCommand(IPerson person) {
		this.person = person;
	}
}
