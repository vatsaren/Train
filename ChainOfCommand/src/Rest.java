public class Rest extends BaseExercise {

	public Rest(IExercise nextExercise, String nameExercise) {
		super(nextExercise, nameExercise);
	}

	@Override
	public void startExercise() {
		System.out.println("отдыхаем");
		nextExercise.startExercise();
	}
}
