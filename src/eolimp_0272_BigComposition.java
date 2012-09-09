
import java.math.BigInteger;
import java.util.Scanner;

public class eolimp_0272_BigComposition {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger a = new BigInteger(in.next());
		BigInteger b = new BigInteger(in.next());
		System.out.println(a.multiply(b).toString());
	}

}
