public abstract class Person {

	public final void runLevel() {
		defeatEnt();
		defeatVimpire();
		crossGap();
		defeatDevil();
	}

	protected abstract void defeatEnt();

	protected abstract void defeatVimpire();

	protected abstract void crossGap();

	protected abstract void defeatDevil();
}
