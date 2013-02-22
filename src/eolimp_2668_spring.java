import java.util.Scanner;


/**
 * @author oleg.semen
 * 
 * Spring
   Требуется заполнить массив размера N×N единичками по спирали (см пример).


Specifications
   Входные данные

   С клавиатуры вводится число N ≤ 50 (нечетное, натуральное).

   Выходные данные

   Требуется вывести на экран построенную спираль.


Problem information
Time Limit: 1 seconds
Memory Limit: 64 MB
Balls for the passed test: 20
Complexity: 64% 8/22
Classes: Two-dimensional arrays
My result: 1/2

Example
Example input
7
Example output
1111111
0000001
1111101
1000101
1011101
1000001
1111111
 */

public class eolimp_2668_spring {
  static char[][] a;
	static char empty = '0';
	static char full = '1';
	
	static void print() {
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a.length; ++j) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}		
	}
	
	static void cleanup() {
		for (int i = 0; i < a.length; ++i)
			for (int j = 0; j < a.length; ++j)
				a[i][j] = empty;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		a = new char [n][n];
		cleanup();
		
		// indicate if we are moving right and then up (true)
		// or left ena then down (false)
		boolean step = true;

		// start point in the center of the matrix
		int i = n/2 + 1;
		int j = n/2 - 1;
		
		//length of segment
		int length = 3; 
		
		try {
			while (true){
				if (step) {
					for (int c = 0; c < length; ++c) 
						a[i][j++] = full; //right 
					j--;
					for (int c = 0; c < length; ++c) 
						a[i--][j] = full; //upp 
					i++;
				} else {
					for (int c = 0; c < length; ++c) 
						a[i][j--] = full; //left
					j++;
					for (int c = 0; c < length; ++c) 
						a[i++][j] = full; //down
					i--;
				}
				step = !step;
				length += 2;
			}
		} catch (ArrayIndexOutOfBoundsException e){
			// we reached the border of matrix
			// and this is break condition for loop
			
			// just print result and terminate
		}
		print();
	}
}
