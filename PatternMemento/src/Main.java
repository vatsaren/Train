public class Main {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		inventory.addItem(new Item("коробка", 0, 0));
		inventory.addItem(new Item("конфета", 0, 1));
		inventory.addItem(new Item("печенька", 1, 0));
		inventory.addItem(new Item("чай", 1, 1));

		System.out.println("Делаю бэкап1");
		System.out.println(inventory);
		Snapshot snap1 = inventory.getSnapshot();


		inventory.addItem(new Item("сухари", 1, 2));
		inventory.addItem(new Item("хлеб", 2, 1));

		System.out.println("Делаю бэкап2");
		System.out.println(inventory);
		Snapshot snap2 = inventory.getSnapshot();

		snap1.restore();
		System.out.println("вернул бэкап1");
		System.out.println(inventory);

		snap2.restore();
		System.out.println("вернул бэкап2");
		System.out.println(inventory);
	}
}