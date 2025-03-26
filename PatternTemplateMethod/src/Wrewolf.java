public class Wrewolf extends Person {

	@Override
	protected void defeatEnt() {
		System.out.println("Оборотень разрывает энта своими когтями на мелкие ветки");
	}

	@Override
	protected void defeatVimpire() {
		System.out.println("Оборотень нанёс серъёзные раны вампиру, а пока тот регенерировал, он его съел");
	}

	@Override
	protected void crossGap() {
		System.out.println("Ловкий оборотень просто перепрыгнул обрыв");
	}

	@Override
	protected void defeatDevil() {
		System.out.println("Оборотень дождался полнолуния и с её помощью одолел дъявола");
	}
}
