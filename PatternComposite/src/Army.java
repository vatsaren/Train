import java.util.ArrayList;
import java.util.List;

public class Army implements IComposite {
	private List<IComposite> army = new ArrayList<>();

	@Override
	public String getUnit() {
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		for (IComposite unit: army) {
			sb.append(unit.getUnit());
			sb.append(", ");
		}
		sb.delete(sb.length() - 2, sb.length());
		sb.append(")");
		return sb.toString();
	}

	public void addUnit(IComposite unit) {
		army.add(unit);
	}
}
