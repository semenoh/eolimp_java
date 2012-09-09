
import java.util.Locale;
import java.util.Scanner;

/**
 * http://www.e-olimp.com.ua/en/problems/57
 */

public class eolimp_0057_Butterfly {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		int z2 = in.nextInt();

		double d = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2) + Math.pow(z2,2));
		
		System.out.format(Locale.US, "%.3f", 1/d);
		System.out.flush();
	}

}
