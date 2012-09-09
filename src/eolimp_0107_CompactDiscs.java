
import java.util.Scanner;

public class eolimp_0107_CompactDiscs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long rez = 100*(n/100);
		rez += 30*((n % 100)/20);
		rez += 2*((n % 100)% 20);
		if (rez > 100*(n/100+1))
			rez = 100*(n/100+1);
		if (rez > 30*((n % 100)/20+1)+100*(n/100))
			rez = 30*((n % 100)/20+1)+100*(n/100);
		System.out.println(rez);
	}

}
