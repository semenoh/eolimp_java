package com.semenoh.eolimp;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author oleg.semen
 *
 */
public class eolimp_2667_Snake {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);

	      int n = in.nextInt();
	      int m = in.nextInt();
	      int x = in.nextInt();
	      int y = in.nextInt();

	      int k = (0 == x%2) ? x*m-y : x*m-1-(m-y);

	      System.out.println(k);
	}

}
