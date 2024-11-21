public class Main {
	public static void main(String[] args) {
		Army army1 = new Army();
		army1.addUnit(new Warrior());
		army1.addUnit(new Warrior());

		Army army2 = new Army();
		army2.addUnit(new Mage());
		army2.addUnit(new Mage());

		Army army3 = new Army();
		army3.addUnit(new Hunter());
		army3.addUnit(new Hunter());

		Army army4 = new Army();
		army4.addUnit(new Hunter());
		army4.addUnit(new Mage());
		army4.addUnit(new Warrior());

		army1.addUnit(army4);
		army1.addUnit(army3);
		army1.addUnit(army2);

		System.out.println(army1.getUnit());
	}
}