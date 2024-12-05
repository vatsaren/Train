import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		int sum = Stream.of(1, 2, 3, 4, 5).reduce(10, (acc, x) -> acc + x);
		String b = Stream.of("s", "u", "p", "e", "r").collect(Collectors.joining("-"));
		System.out.println(b);

		String c = Stream.of("s", "u", "p", "e", "r").collect(Collectors.joining(" -> ", "[ ", " ]"));
		System.out.println(c);


		List<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.add("Six");
		list.add("Seven");
		list.add("Eight");
		list.add("Nine");
		list.add("Ten");
		Stream stream = list.stream();

		Test1 test1= new Test1();
		test1.run();

	}



}