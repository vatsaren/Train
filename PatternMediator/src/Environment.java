public class Environment implements IMediator {

	private Component human = new Component(this) {};
	private Component bottle = new Component(this) {};

	@Override
	public void notice(Component sender, String event) {
		if (sender == human) {
			bottle.executeAction("бутылка наполняется");
		}
	}

	public void collectWater() {
		human.executeAction("Набрать воды в бутылку");
	}
}
