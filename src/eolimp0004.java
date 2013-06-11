import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * http://www.e-olimp.com.ua/en/problems/4
 * 
 * Two circles 
 * 
 * How many points in common two given circles have?
 * 
 * Specifications
 * 
 * Input
 * 6 numbers x1, y1, r1, x2, y2, r2, where x1, y1, x2, y2 are the coordinates of the centers of the circles, r1, r2 are its radii.
 * Всі числа - дійсні, не перевищують 1000000000 за модулем, та задані не більш ніж з 3 знаками після коми.
 * 
 * Output
 * The number of common points for two circles: 0, 1 or 2. Print -1 if circles have a lot of common points.
 * 
 * 
 * Problem information
 * Time Limit: 1 seconds
 * Memory Limit: 64 MB
 * Balls for the passed test: 14.2857
 * Complexity: 42% 986/1689
 * Classes: Geometry
 * 
 * Example
 * Example input
 * 0 0 5 5 0 5
 * Example output
 * 2
 */

/**
 * @author oleg.semen
 *
 */
public class eolimp0004 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);
	  	PrintWriter out = new PrintWriter(System.out);
	   
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double r1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double r2 = in.nextDouble();
 
		if (x1 == x2 && y1 == y2 && r1==r2){
			System.out.println(-1);   
			return;
		}
	
		double dx = Math.abs(x1 - x2);
		double dy = Math.abs(y1 - y2);
		double distance = Math.sqrt(dx*dx + dy*dy);
	   
		double a=0, b=0, c=0;
		if (distance >= r1 && distance >= r2){
		   a = distance;
		   b = r1;
		   c = r2;
		} else if (r1 >= distance && r1 >= r2){
		   a = r1;
		   b = r2;
		   c = distance;
		} else if (r2 >= distance && r2 >= r1){
		   a = r2;
		   b = r1;
		   c = distance;
		}
		
		if (a == b+c)
		   out.println(1);
		if (a > b+c)
		   out.println(0);
		if (a < b+c)
		   out.println(2);
	   
		out.flush();
	}
}
