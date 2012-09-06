package com.semenoh.eolimp;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author oleg.semen
 *
 */
public class eolimp_2666_Half {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		
		for(int row = 0; row < n; ++row){
			for (int col = 0; col < n; ++col){
				if (n - col - 1 < row)
					System.out.print(1);
				else if (n - col - 1 == row)
					System.out.print(0);
				else
					System.out.print(2);
			}
			System.out.println();
		}
	}
}
