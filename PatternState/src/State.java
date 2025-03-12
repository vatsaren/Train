public abstract class State implements IState {

	protected final Car context;

	protected State(Car context) {
		this.context = context;
	}

	public void pushGas() {
		System.out.println("Ничего не делает");
	}

	public void pushBrake() {
		System.out.println("Ничего не делает");
	}

	public void engineStart() {
		System.out.println("Ничего не делает");
	}

	public void engineStop() {
		System.out.println("Ничего не делает");
	}

}
