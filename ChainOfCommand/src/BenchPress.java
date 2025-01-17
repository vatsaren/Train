public class BenchPress extends BaseExercise {

	public BenchPress(IExercise nextExercise, String nameExercise) {
		super(nextExercise, nameExercise);
	}

	@Override
	public void startExercise() {
		System.out.println("Ищем где поделать становую");
		super.startExercise();
	}
}
