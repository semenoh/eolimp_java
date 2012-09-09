
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author oleg.semen
 *
 */
public class eolimp_0313_BigSumOrSubtractionAandB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);
		BigInteger a;
		BigInteger b;
		int z = 0; 
		int n = in.nextInt();
		for (int i = 0; i < n; ++i){
			String s = in.next();
			z = s.indexOf('+');
			if (-1 != z){
				a = new BigInteger(s.substring(0, z));
				b = new BigInteger(s.substring(z+1));
				System.out.println(a.add(b));
			}else{
				z = s.indexOf('-');
				a = new BigInteger(s.substring(0, z));
				b = new BigInteger(s.substring(z+1));
				System.out.println(a.subtract(b));
			}
				
		}
	}

}
