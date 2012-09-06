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
public class eolimp_0108_MedianNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		if ((a > b && a < c) || (a < b && a > c))
			System.out.println(a);
		if ((b > a && b < c) || (b < a && b > c))
			System.out.println(b);
		if ((c > a && c < b) || (c < a && c > b))
			System.out.println(c);
	}

}
