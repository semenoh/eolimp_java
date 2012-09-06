package com.semenoh.eolimp;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author oleg.semen
 *
 */
public class eolimp_0138_CashMachine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int[] c = {10, 20, 50, 100, 200, 500};
		int n = in.nextInt();
		int count = 0;
		if (0 != n % 10){
			System.out.println(-1);
			return;
		}
		for (int i = c.length - 1; i >= 0 && n > 0; --i){
			if (0 < n / c[i]){
				count += n / c[i];
				n = n % c[i];
			}
		}
		
		out.println( count );
		out.flush();
	}
}
