public class Main {
	public static void main(String[] args) {
		BenchPress benchPress = new BenchPress(null, Exercises.BENCH_PRESS.getNameExercises());
		Rest rest1 = new Rest(benchPress, Exercises.REST.getNameExercises());
		Squats squats = new Squats(rest1, Exercises.SQUATS.getNameExercises());
		Rest rest2 = new Rest(squats, Exercises.REST.getNameExercises());
		MillitaryPress millitaryPress = new MillitaryPress(rest2, Exercises.MILITARY_PRESS.getNameExercises());
		Rest rest3 = new Rest(millitaryPress, Exercises.REST.getNameExercises());
		DeadLift deadLift = new DeadLift(rest3, Exercises.DEADLIFT.getNameExercises());
		deadLift.startExercise();
	}
}