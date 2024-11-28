package decorator;

public class GausTankWrapper implements ITankDecorator {
	protected ITankDecorator wrappe;

	public GausTankWrapper(ITankDecorator wrappe) {
		this.wrappe = wrappe;
	}

	@Override
	public String startEngine() {
		return wrappe.startEngine();
	}

	@Override
	public String move() {
		return wrappe.move();
	}

	@Override
	public String fire() {
		return wrappe.fire() + " из пушки гауса";
	}
}
