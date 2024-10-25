package units;

import java.util.HashMap;
import java.util.Map;

public class UnitStorage {

	public enum UnitsName {
		MAGE_LVL_1,
		MAGE_LVL_2,
		MAGE_LVL_3,
		WARRIOR_LVL_1,
		WARRIOR_LVL_2,
		WARRIOR_LVL_3
	}

	private Map<UnitsName, Unit> storage = new HashMap<>();

	public UnitStorage() {
		WarriorUnit war1 = new WarriorUnit();
		war1.level = 1;
		war1.health = 100;
		war1.rage = 100;

		WarriorUnit war2 = new WarriorUnit();
		war2.level = 2;
		war2.health = 200;
		war2.rage = 200;

		WarriorUnit war3 = new WarriorUnit();
		war3.level = 3;
		war3.health = 300;
		war3.rage = 300;

		MageUnit mage1 = new MageUnit();
		mage1.level = 1;
		mage1.health = 100;
		mage1.mana = 100;

		MageUnit mage2 = new MageUnit();
		mage2.level = 2;
		mage2.health = 200;
		mage2.mana = 200;


		MageUnit mage3 = new MageUnit();
		mage3.level = 3;
		mage3.health = 300;
		mage3.mana = 300;

		storage.put(UnitsName.WARRIOR_LVL_1, war1);
		storage.put(UnitsName.WARRIOR_LVL_2, war2);
		storage.put(UnitsName.WARRIOR_LVL_3, war3);
		storage.put(UnitsName.MAGE_LVL_1, mage1);
		storage.put(UnitsName.MAGE_LVL_2, mage2);
		storage.put(UnitsName.MAGE_LVL_3, mage3);
	}

	public Unit getUnit(UnitsName name) {
		return storage.get(name).clone();
	}
}
