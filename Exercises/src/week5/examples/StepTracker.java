package week5.examples;

public class StepTracker {
	private int totalStepCount;
	private int activeDays;
	private int dayCount;
	private int target;

	public StepTracker(int target) {
		this.target = target;
	}

	public int activeDays() {
		return activeDays;
	}

	public int averageSteps() {
		if (dayCount != 0)
			return totalStepCount / dayCount;
		else
			return 0;
	}

	public void addDailySteps(int stepCount) {
		if (stepCount >= target) {
			activeDays++;
		}
		totalStepCount += stepCount;
		dayCount++;

	}

	public int getTotalSteps() {
		return totalStepCount;
	}

}
