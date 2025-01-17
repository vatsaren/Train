public class Squats extends BaseExercise {

	public Squats(IExercise nextExercise, String nameExercise) {
		super(nextExercise, nameExercise);
	}

	@Override
	public void startExercise() {
		System.out.println("Ищем где поприседать");
		super.startExercise();
	}
}
