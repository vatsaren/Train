public class DeadLift extends BaseExercise {

	public DeadLift(IExercise nextExercise, String nameExercise) {
		super(nextExercise, nameExercise);
	}

	@Override
	public void startExercise() {
		System.out.println("Ищем где поделать становую");
		super.startExercise();
	}
}
