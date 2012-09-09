
import java.util.Scanner;

/**
 * http://www.e-olimp.com.ua/ua/problems/933
 */

/**
 * @author oleg.semen
 *
 */
public class eolimp_0933_SumOfTwoDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = Math.abs(in.nextInt());

		System.out.println(n/10+n%10);
	}
}
