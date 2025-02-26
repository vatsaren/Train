import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventory {

	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public void restore(List<Item> backup) {
		items = backup;
	}

	public Snapshot getSnapshot() {
		List<Item> backup = new ArrayList<>(items);
		return new Snapshot(this, backup);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Item item : items) {
			sb.append(item.getName()).append("\n");
		}
		return sb.toString();
	}
}
