import car.BaseCare;
import car.ICar;
import command.CommandDrive;
import command.CommandIntoTheCar;
import command.CommandOutTheCar;
import command.ICommand;
import person.IPerson;
import person.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		IPerson pers1 = new Person("Аркаша");
		ICar car1 = new BaseCare("додж");

		List<ICommand> commands = new ArrayList<>();
		commands.add(new CommandIntoTheCar(pers1, car1));
		commands.add(new CommandDrive(pers1, car1, "Осташков"));
		commands.add(new CommandOutTheCar(pers1, car1));

		for (ICommand command : commands) {
			command.execute();
		}
	}
}