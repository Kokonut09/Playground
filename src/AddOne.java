
//https://www.reddit.com/r/dailyprogrammer/comments/aphavc/20190211_challenge_375_easy_print_a_new_number_by/

public class AddOne {

	public static void main(String[] args) {

		int nums = 7;
		
		System.out.println(addOne(nums));
		
	}

	private static int addOne(int nums) {
		int retVal = 0;
		
		if(nums < 9) {
			retVal = nums+1;
			
		}else
			retVal = 10;
		
		
		return retVal;
	}

}
/*
 *
 *
 *
 */
