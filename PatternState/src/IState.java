public interface IState {

	void pushGas();

	void pushBrake();

	void engineStart();

	void engineStop();

	String getName();
}
