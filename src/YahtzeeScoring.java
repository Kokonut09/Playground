/**
 * 
 * https://www.reddit.com/r/dailyprogrammer/comments/dv0231/20191111_challenge_381_easy_yahtzee_upper_section/
 * @author a09sa
 *
 */
public class YahtzeeScoring {

	public static void main(String[] args) {
		
		int[] roll = {2,3,5,5,6};
		
		
		
		System.out.println(yahtzeeUpper(roll));

	}

	private static int yahtzeeUpper(int[] roll) {
		
		int yHigh = 0;
		int yCount = 0;
		
		for(int i = 0; i<roll.length; i++) {
			int count = 0;
			int highNums = 0;
			
			for(int j =0; j<roll.length;j++) {
				
				if (roll[i] == roll[j]) {
					count++;
				}
				
			}
			if(count >= yHigh) {
				yHigh = i;
				yCount = count;
			}
			
			
		}
		
		return yHigh*yCount;
	}

}
