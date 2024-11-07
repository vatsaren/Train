public class Adapter implements IAdapter {
	private OldHuman target;

	public Adapter(OldHuman target) {
		this.target = target;
	}

	@Override
	public void servePerson() {
		target.wash();
		target.eat();
		target.pushTablet();
	}
}
