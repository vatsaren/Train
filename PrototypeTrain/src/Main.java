import units.UnitStorage;

import units.UnitStorage.UnitsName;
public class Main {
	public static void main(String[] args) {
		UnitStorage unitStorage = new UnitStorage();

		System.out.println("Армия состоит из");

		System.out.println(unitStorage.getUnit(UnitsName.WARRIOR_LVL_1));
		System.out.println(unitStorage.getUnit(UnitsName.WARRIOR_LVL_2));
		System.out.println(unitStorage.getUnit(UnitsName.WARRIOR_LVL_3));
		System.out.println(unitStorage.getUnit(UnitsName.MAGE_LVL_1));
		System.out.println(unitStorage.getUnit(UnitsName.MAGE_LVL_2));
		System.out.println(unitStorage.getUnit(UnitsName.MAGE_LVL_3));
	}
}