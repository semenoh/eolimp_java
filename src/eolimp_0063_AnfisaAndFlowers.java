
import java.util.Scanner;


public class eolimp_0063_AnfisaAndFlowers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		long m = in.nextInt();
		long rez = m*n-m-n+2;
		System.out.println(rez);
	}
}
