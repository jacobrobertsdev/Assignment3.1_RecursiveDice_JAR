
public class RecDieRollerDriver {

	public static void main(String[] args) {

		
		RecDieRoller roller = new RecDieRoller();
		
		int[] rollResults = new int[1000];
		double avgRolls, sum = 0;
		
		for(int i = 0; i < rollResults.length; i++) {
			rollResults[i] = roller.roll(0);
		}

		for(int roll : rollResults) {
			sum += roll;
		}
		
		avgRolls = sum / 1000;
		
		System.out.println("It took an average of " + avgRolls + " rolls to roll a 2.");
	}

}
