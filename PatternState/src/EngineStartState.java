public class EngineStartState extends State {

	protected EngineStartState(Car context) {
		super(context);
	}

	@Override
	public void engineStop() {
		System.out.println("Двигатель остановлен");
		context.changeState(new EngineStopState(context));
	}

	@Override
	public void pushGas() {
		System.out.println("Нажат газ");
		context.changeState(new PushGasState(context));
	}

	@Override
	public void pushBrake() {
		System.out.println("Нажат тормоз");
		context.changeState(new PushBraekState(context));
	}

	@Override
	public String getName() {
		return "EngineStartState";
	}
}
