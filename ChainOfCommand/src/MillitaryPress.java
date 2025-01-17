public class MillitaryPress extends BaseExercise {

	public MillitaryPress(IExercise nextExercise, String nameExercise) {
		super(nextExercise, nameExercise);
	}

	@Override
	public void startExercise() {
		System.out.println("Ищем где сделать армейский жим");
		super.startExercise();
	}
}
