public abstract class Component {

	IMediator mediator;

	protected Component(IMediator mediator) {
		this.mediator = mediator;
	}

	public void executeAction(String action) {
		System.out.println(action);
		mediator.notice(this, action);
	}
}
