
//https://www.reddit.com/r/dailyprogrammer/comments/aphavc/20190211_challenge_375_easy_print_a_new_number_by/

public class AddOne {

	public static void main(String[] args) {

		int nums = 1234;

		System.out.println(addOne(nums));

	}

	private static String addOne(int nums) {

		String retVal = "";

		if(nums < 10) {
			
			return retVal += (nums+1);
			
		}else {
			int temp = 0;
			if(nums<1000000 && nums >= 100000) {

				temp = nums / 100000;
				
			}else if(nums <100000 && nums >= 10000) {
				
				temp = nums / 10000;

				
			}else if(nums <10000 && nums >= 1000) {
				
				temp = nums / 1000;

				
			}else if(nums <1000 && nums >= 100) {
				
				temp = nums / 100;

				
			}else if(nums <100 && nums >= 10) {
				
				temp = nums / 10;

			}
			return retVal += (temp+1) + addOne(nums/10) ;
		}



	}

}
/*
 *
 *
 *
 */
