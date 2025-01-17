public enum Exercises {
	BENCH_PRESS("жим лёжа"),
	DEADLIFT("становая тяга"),
	SQUATS("приседания"),
	MILITARY_PRESS("армейский жим"),
	REST("отдых");

	private final String nameExercises;

	Exercises(String nameExercises) {
		this.nameExercises = nameExercises;
	}

	public String getNameExercises() {
		return nameExercises;
	}

}
