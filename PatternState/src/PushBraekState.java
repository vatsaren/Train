public class PushBraekState  extends State {

	protected PushBraekState(Car context) {
		super(context);
	}

	@Override
	public void pushGas() {
		System.out.println("Нажат газ");
		context.changeState(new PushGasState(context));
	}

	@Override
	public void engineStop() {
		System.out.println("Двигатель остановлен");
		context.changeState(new EngineStopState(context));
	}

	@Override
	public String getName() {
		return "PushBraekState";
	}
}
