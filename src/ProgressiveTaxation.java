/**
 * https://www.reddit.com/r/dailyprogrammer/comments/cdieag/20190715_challenge_379_easy_progressive_taxation/
 * @author a09sa
 *
 */
public class ProgressiveTaxation {

	public static void main(String[] args) {


		int income = 1234567;
		System.out.println(taxIt(income));


	}

	/**
	 * Income over the threshold will be static. Example. income of 40,000 or 50,000 will have
	 * the 2000 tax from the previous tax bracket, then you will only need to calculate the remainder
	 * with the appropriate tax bracket 
	 * @param income
	 * @return
	 */
	private static int taxIt(int income) {

		int taxBracket1 = 0;
		int taxBracket2 = 10;
		int taxBracket3 = 25;
		int taxBracket4 = 40;

		int tax = 0;


		if(income > 100000) {
		
			tax = (income - 100000) * taxBracket4/100 + 2000 + 17500;

		}else if(income>30000) {

			tax = (income - 30000) * taxBracket3/100 + 2000;

		}else if(income>10000) {

			tax = (income-10000) * taxBracket2 /100; 
		}

		return tax;
	}



}
