import java.util.Scanner;

/**
 * @author oleg.semen
 * 
 *         How many times to repeat? The positive integer number N is given. We
 *         subtract from this number the sum of its digits. From the received
 *         number we soon subtract the sum of its digits and so on. This
 *         operation continues until the number is positive. How many times this
 *         operation will be repeated?
 * 
 * 
 *         Specifications Input
 * 
 *         The number N, 0 < N < 2000000000.
 * 
 *         Output
 * 
 *         The number of performed operations.
 * 
 * 
 *         Problem information Time Limit: 10 seconds Memory Limit: 64 MB Balls
 *         for the passed test: 10 Complexity: 29% 703/988
 * 
 *         Example Example input 23 Example output 3
 */

public class eolimp_0020_HowManyTimes {
  static int digitsSum(int i) {
		int sum = 0;
		while (i > 0) {
			sum += i % 10;
			i = i / 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
		int counter = 0;
		while (n > 0) {
			++counter;
			n -= digitsSum(n);
		}
		
		System.out.println(counter);
	}
}
