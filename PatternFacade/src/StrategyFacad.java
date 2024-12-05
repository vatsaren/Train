import characters.DdWarrior;
import characters.HealPrist;
import characters.RddMage;
import characters.TankWarrior;

public class StrategyFacad {

	TankWarrior tank = new TankWarrior();
	DdWarrior dd = new DdWarrior();
	RddMage rdd = new RddMage();
	HealPrist heal = new HealPrist();

	public void zergStrategy() {
		tank.tauntBoss();
		heal.healTarget(tank);
		System.out.println("ждём когда танк наберёт агро");
		dd.attackBoss();
		rdd.attackBoss();
		heal.healTarget(tank);
		System.out.println("ждём когда дд разгонятся");
		heal.healAll();
		heal.healTarget(tank);
		dd.burstOn();
		rdd.burstOn();
		tank.protectCommand();
		heal.healAll();
		heal.healTarget(heal);
		heal.healTarget(dd);
		heal.healTarget(rdd);
		System.out.println("босс вот вот будет повержен!!!");
		heal.healTarget(tank);
		System.out.println("босс повержен!!!");
	}
}
