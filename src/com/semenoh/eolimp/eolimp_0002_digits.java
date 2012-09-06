package com.semenoh.eolimp;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author oleg.semen
 *
 */
public class eolimp_0002_digits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int n = in.nextInt();
		BigInteger k = new BigInteger("2");
		k = k.pow(n).multiply(new BigInteger("3")).subtract(new BigInteger("2"));
		out.println(k);

		out.flush();
	}
}
