import role.IDamager;
import role.IHealer;
import role.IRoleFactory;
import role.ITank;

public class Command {

	private IRoleFactory factory;
	private IHealer healer;
	private ITank tank;
	private IDamager damager;

	public Command(IRoleFactory factory) {
		this.factory = factory;
	}

	public void createCommand() {
		healer = factory.createHealer();
		tank = factory.createTank();
		damager = factory.createDamager();
	}

	public void goDangeon() {
		damager.attack();
		tank.protect();
		healer.heal();
	}
}
