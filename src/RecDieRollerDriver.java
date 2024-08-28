
public class RecDieRollerDriver {

	public static void main(String[] args) {

		// Instantiate RecDieRoller
		RecDieRoller roller = new RecDieRoller();

		// Create array of integers to store roll counts
		int[] rollResults = new int[1000];

		// Variables to calculate average roll count
		double avgRolls, sum = 0;

		// Roll 1000 times, pushing the roll count to rollResults array
		for (int i = 0; i < rollResults.length; i++) {
			rollResults[i] = roller.roll(0);
		}

		// Sum all roll counts in rollResults
		for (int roll : rollResults) {
			sum += roll;
		}

		// Calculate the average roll of rollResults
		avgRolls = sum / 1000;

		// Print the average number of rolls
		System.out.println("It took an average of " + avgRolls + " rolls to roll a 2.");
	}

}
