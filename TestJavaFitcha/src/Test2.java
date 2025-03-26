import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test2 {

	public void execute() {
		int pocketSize = 10;
		List<String> lst = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			lst.add(String.valueOf(i));
		}

		List<List<String>> pockets = IntStream.range(0, lst.size())
				.filter(i -> i % pocketSize == 0)
				.mapToObj(i -> lst.subList(i, Math.min(i + pocketSize, lst.size())))
				.collect(Collectors.toList());
		System.out.println(pockets);
	}
}
