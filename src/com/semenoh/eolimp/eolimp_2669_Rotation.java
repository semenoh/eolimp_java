package com.semenoh.eolimp;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author oleg.semen
 *
 */
public class eolimp_2669_Rotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		long[][] a = new long [n][m];
		for(int row = 0; row < n; ++row){
			for (int col = 0; col < m; ++col){
				a[row][col] = in.nextLong();
			}
		}
		
		System.out.println(m + " " + n);
		
		for (int col = 0; col < m; ++col){
			for(int row = n-1; row>= 0; --row){
				System.out.print(a[row][col]);
				if (0 != row)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
