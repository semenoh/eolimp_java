
import java.util.Scanner;


public class eolimp_0192_SimpleFibonachi {
	
	static boolean isSimple(int n){
		for (int i = 2; i < n; ++i)
			if (0 == n%i)
				return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = {2, 3, 5, 13, 89, 233, 1597, 28657, 514229, 433494437 }; 
		int n = in.nextInt();
//		int pprev = 1;
//		int prev = 1;
//		int count = 0;
//		for (n = 1; n <= 11; ++n){
//			while (count < n){
//				int tmp = prev;
//				prev += pprev;
//				pprev = tmp;
//				if (isSimple(prev))
//					++count;
//			}
//		
//		System.out.println(n + " " + prev);
//		}
	
	System.out.println(arr[n-1]);
	}

}
