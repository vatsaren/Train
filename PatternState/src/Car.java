public class Car {

	private IState state = new EngineStopState(this);

	public void changeState(IState state) {
		System.out.println("Состояние меняется с " + this.state.getName() + " на " + state.getName());
		this.state = state;
	}

	public void engineStart() {
		state.engineStart();
	}

	public void engineStop() {
		state.engineStop();
	}

	public void pushGas() {
		state.pushGas();
	}

	public void pushBrake() {
		state.pushBrake();
	}
}
