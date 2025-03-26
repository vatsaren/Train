public class Human extends Person{

	@Override
	protected void defeatEnt() {
		System.out.println("Человек достаёт мечь и рубит им энта");
	}

	@Override
	protected void defeatVimpire() {
		System.out.println("Человек пользуется воспламеняющейся жидкостью и сжигает вампира");
	}

	@Override
	protected void crossGap() {
		System.out.println("Человек использует крюк кошку");
	}

	@Override
	protected void defeatDevil() {
		System.out.println("Человек молится богу и с его силой побеждает дъявола");
	}
}
