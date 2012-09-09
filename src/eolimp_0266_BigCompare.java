
import java.math.BigInteger;
import java.util.Scanner;

public class eolimp_0266_BigCompare {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger a = new BigInteger(in.next());
		BigInteger b = new BigInteger(in.next());
		switch(a.compareTo(b)){
		case -1:
			System.out.println("<");
			break;
		case 0:
			System.out.println("=");
			break;
		case 1:
			System.out.println(">");
			break;
			
		}
	}
}
