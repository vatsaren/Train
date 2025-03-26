public class Ork extends Person{

	@Override
	protected void defeatEnt() {
		System.out.println("Орк разорвал энта своими здоровыми руками на части");
	}

	@Override
	protected void defeatVimpire() {
		System.out.println("Орк своими мощными ударами просто выбросил вампира в обрыв");
	}

	@Override
	protected void crossGap() {
		System.out.println("Орк своей огромной силой опрокинул большую колонну на обрыв и перебрался по ней");
	}

	@Override
	protected void defeatDevil() {
		System.out.println("Орк очень долго сражался с дъяволом, и оказался более выносливым чем он, дъявол просто упал от бессилия без единой раны, а израненный орк его добил");
	}
}
