public class Main {
	public static void main(String[] args) {
		ICollection collection = new Collection();
		collection.add(1);
		collection.add(2);
		collection.add(3);
		collection.add(4);
		collection.add(5);
		collection.add(6);
		IIterator iter = collection.createIterator();
		while(iter.hasNext()) {
			System.out.println(iter.getNext());
		}

	}
}