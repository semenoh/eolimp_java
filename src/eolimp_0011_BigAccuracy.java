
import java.math.BigDecimal;
import java.util.Scanner;

public class eolimp_0011_BigAccuracy {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigDecimal a = new BigDecimal(in.next());
		BigDecimal b = new BigDecimal(in.next());
		int k = in.nextInt();
		BigDecimal c = a.divide(b, k, 1);
		System.out.println(c.toPlainString());
	}

}
