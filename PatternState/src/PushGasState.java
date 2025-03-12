public class PushGasState  extends State {

	protected PushGasState(Car context) {
		super(context);
	}

	@Override
	public void pushBrake() {
		System.out.println("Во время движения нажат тормоз");
		context.changeState(new PushBraekState(context));
	}

	@Override
	public String getName() {
		return "PushGasState";
	}
}
