public abstract class BaseExercise implements IExercise {

	protected final IExercise nextExercise;
	private final String nameExercise; //данная переменная, если равна Null также будет имитировать ситуацию невозможности выполнения задачи

	protected BaseExercise(IExercise nextExercise, String nameExercise) {
		this.nextExercise = nextExercise;
		this.nameExercise = nameExercise;
	}

	@Override
	public void startExercise() {
		if(checkMachine()) {
			System.out.println(nameExercise);
		}
		if(nextExercise != null) {
			nextExercise.startExercise();
		}
	}

	private boolean checkMachine() {
//		return Math.random() < 0.9;
		return true;
	}
}
