import java.util.ArrayList;
import java.util.List;

public class Collection implements ICollection {

	private List<Integer> array = new ArrayList<>();

	@Override
	public void add(Integer value) {
		array.add(value);
	}

	@Override
	public List<Integer> getArray() {
		return array;
	}

	@Override
	public IIterator createIterator() {
		return new Iterator(this);
	}
}
