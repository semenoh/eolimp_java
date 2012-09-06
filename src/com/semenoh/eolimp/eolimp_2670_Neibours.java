package com.semenoh.eolimp;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author oleg.semen
 *
 */
public class eolimp_2670_Neibours {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);

	     long m = in.nextInt();
	     long n = in.nextInt();
	     long x = in.nextInt();
	     long y = in.nextInt();
	     
	     if (x>1) System.out.println((x-1) + " " + y);
	     if (x<m) System.out.println((x+1) + " " + y);
	     if (y>1) System.out.println(x + " " + (y-1));
	     if (y<n) System.out.println(x + " " + (y+1));
	}

}
