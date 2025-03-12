public class EngineStopState extends State {

	protected EngineStopState(Car context) {
		super(context);
	}

	@Override
	public void engineStart() {
		System.out.println("Двигатель запущен");
		context.changeState(new EngineStartState(context));
	}

	@Override
	public String getName() {
		return "EngineStopState";
	}
}
