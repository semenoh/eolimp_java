import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Matches
   Какое минимальное количество спичек необходимо для того, чтобы выложить на плоскости N квадратов со стороной в одну спичку? Спички нельзя ломать и класть друг на друга. Вершинами квадратов должны быть точки, где сходятся концы спичек, а сторонами – сами спички.

   Напишите программу, которая по количеству квадратов N, которые необходимо составить, находит минимальное необходимое для этого количество спичек.


Specifications
   Входные данные

   Единственная строка входного файла содержит одно целое число N (1 ≤ N ≤ 109).

   Выходные данные

   Единственная строка выходного файла должна содержать одно целое число – минимальное количество спичек требуемых для составления заданного количества квадратов.


Problem information
Time Limit: 1 seconds
Memory Limit: 64 MB
Balls for the passed test: 4.7619
Complexity: 33% 575/860
Classes: Modeling

Example
 */

public class eolimp0008 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int n = in.nextInt();
		if (0 == n){
			System.out.println(0);
			return;
		}
		int line1 = (int) Math.sqrt(n);
		int line2 = n / line1;
		int mainMatches = line1*(line2+1) + line2*(line1+1);
		
		int addRc = n - line1*line2;
		int addMatches = (0 == addRc) ? 0 : addRc*(1+1) + 1*(addRc+1) - addRc;
		long allMatches = mainMatches + addMatches;
		
		out.println(allMatches);
		
		out.flush();
	}
}
