import java.util.Random;

/**
 * Simulates a die roll using the recursive method roll()
 * 
 */
public class RecDieRoller {

	/**
	 * Recursively simulates rolling a die until a 2 is rolled. Keeps track of the
	 * total number of rolls taken to roll a 2.
	 * 
	 * @param rollCount the inital count of rolls, should be initialized to 0.
	 * @return the total number of rolls
	 */
	public int roll(int rollCount) {

		Random r = new Random();
		int result = r.nextInt(6) + 1;

		rollCount += 1;

		if (result == 2) { // Base case
			return rollCount;
		} else {
			return roll(rollCount); // Recursive case
		}

	}
}
