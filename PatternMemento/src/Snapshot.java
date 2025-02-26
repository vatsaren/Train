import java.util.List;

public class Snapshot implements ISnapshot{

	private Inventory target;
	private List<Item> backup;

	public Snapshot(Inventory target, List<Item> backup) {
		this.target = target;
		this.backup = backup;
	}

	@Override
	public void restore() {
		target.restore(backup);
	}
}
