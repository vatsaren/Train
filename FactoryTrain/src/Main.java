import weapons.factory.AxeFactory;
import weapons.factory.SwordFactory;
import weapons.factory.WeaponFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
	public static void main(String[] args) throws IOException {
		String context = getContext();
		WeaponFactory weaponFactory = null;
		if ("Sword".equals(context)) {
			weaponFactory = new SwordFactory();
		} else if ("Axe".equals(context)) {
			weaponFactory = new AxeFactory();
		}

		weaponFactory.useActions();
	}

	private static String getContext() throws IOException {
		try {
			Properties props = new Properties();
			props.load(new FileInputStream(new File("FactoryTrain/src/config/config.ini")));
			return props.getProperty("context").toString();
		}
		catch (IOException | NullPointerException e) {
			System.out.println(e);
			return "Axe";
		}
	}
}