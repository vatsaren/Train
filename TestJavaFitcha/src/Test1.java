import java.util.stream.IntStream;

public class Test1 {

	public void run() {
		IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(this::filter1).map(x -> x + 10)
				.limit(3).forEach(System.out::println);
		System.out.println("\n");
		IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90).map(x -> x + 10)
				.limit(3).forEach(System.out::println);
	}
	private boolean filter1(int x) {
		return x < 90;
	}
}
