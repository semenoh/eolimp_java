
import java.math.BigInteger;
import java.util.Scanner;

public class eolimp_0273_APowerBModM {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger a = new BigInteger(in.next());
		int b = in.nextInt();
		BigInteger m = new BigInteger(in.next());
		System.out.println(a.pow(b).mod(m).toString());
	}

}
