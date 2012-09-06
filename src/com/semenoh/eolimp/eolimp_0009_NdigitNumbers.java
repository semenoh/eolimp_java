package com.semenoh.eolimp;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * N-digit numbers
   Find the quantity of N-digit numbers, which the sum is equal to their product. Call the least from numbers for given N (N < 10).


Specifications
   Input

   The number N is not exceeding 10.

   Output

   In output file have written 2 numbers: a quantity of numbers and a less number through blank.


Problem information
Time Limit: 1 seconds
Memory Limit: 64 MB
Balls for the passed test: 10
Complexity: 35% 414/640

Example
Example input
1
Example output
10 0
 */

/**
 * @author oleg.semen
 *
 */
public class eolimp_0009_NdigitNumbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int n = in.nextInt();
		
		int[] d = new int[n];

		if (1 == n){
			System.out.println("10 0");
			return;
		}
		
//		TODO: try to use conbinations
		
		d[0] = 1;
		for (int i = 1; i < d.length; ++i)
			d[i] = 0;
		
		int sum = 0;
		int mul = 1;
		int theFirst = -1;
		int count = 0;
		out:
		while(true){
			sum = 0;
			mul = 1;
			int curVal = 0;
			int a = 1; 
			int ten = 1;
			for (int i = d.length-1; i >= 0; --i){
				sum += d[i];
				mul *= d[i];
				curVal = (int) (curVal + d[i]*ten);
				ten *= 10;
				if (1 == a){
					if (d[i] < 9){ 
						d[i] += a;
						a = 0;
					} else { //d[i] == 9
						d[i] = 0;
						if(0 == i)
							break out;
					}
				}
			}
			
			if (sum == mul){
				++count;
				System.out.println(curVal);
				if (-1 == theFirst){
					theFirst = curVal;
				}
			}
		}
		
		out.println("" + count + " " + theFirst);
		
		out.flush();
	}
}
