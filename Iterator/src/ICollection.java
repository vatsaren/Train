import java.util.List;

public interface ICollection {

	IIterator createIterator();
	List<Integer> getArray();
	void add(Integer value);
}
