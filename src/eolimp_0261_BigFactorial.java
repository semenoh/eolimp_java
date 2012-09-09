
import java.math.BigInteger;
import java.util.Scanner;


public class eolimp_0261_BigFactorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = new BigInteger(in.next());
		BigInteger a = BigInteger.ONE;
		for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE))
			a = a.multiply(i);
		System.out.println(a.toString());
	}
}