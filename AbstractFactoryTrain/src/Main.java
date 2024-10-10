import raceHuman.HumanFactory;
import raceOrk.OrkFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws IOException {
		Command command = "Human".equals(Main.getContext())
						  ? new Command(new HumanFactory())
						  : new Command(new OrkFactory());
		command.createCommand();
		command.goDangeon();
	}

	private static String getContext() throws IOException {
		try {
			Properties props = new Properties();
			props.load(new FileInputStream(new File("AbstractFactoryTrain/src/config/config.ini")));
			return props.getProperty("context").toString();
		}
		catch (IOException | NullPointerException e) {
			System.out.println(e);
			return "Human";
		}
	}
}