
import java.io.PrintWriter;
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
public class eolimp_0004_TwoCircles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

	       double x1 = in.nextDouble();
	       double y1 = in.nextDouble();
	       double r1 = in.nextDouble();
	       double x2 = in.nextDouble();
	       double y2 = in.nextDouble();
	       double r2 = in.nextDouble();

			if ( x1 == x2 && y1 == y2 && r1 == r2 ){
				out.print("-1");
				out.flush();
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
	       
	       if (a > b+c)
	           out.println(1);
	       else if (a < b+c)
	           out.println(2);
	       else
	    	   out.println(0);
		
//		BigDecimal x1 = null;
//		BigDecimal y1 = null;
//		BigDecimal r1 = null;
//		BigDecimal x2 = null;
//		BigDecimal y2 = null;
//		BigDecimal r2 = null;
//
//		try {
//			double d = in.nextDouble();
//			x1 = new BigDecimal(Double.toString(d));
//			d = in.nextDouble();
//			y1 = new BigDecimal(Double.toString(d));
//			d = in.nextDouble();
//			r1 = new BigDecimal(Double.toString(d));
//			d = in.nextDouble();
//			x2 = new BigDecimal(Double.toString(d));
//			d = in.nextDouble();
//			y2 = new BigDecimal(Double.toString(d));
//			d = in.nextDouble();
//			r2 = new BigDecimal(Double.toString(d));
//		} catch (Exception e){
//			e.printStackTrace();
//			out.println(0);
//			out.flush();
//			return;
//		}
//		if (
//				x1.compareTo(x2) == 0 &&
//				y1.compareTo(y2) == 0 &&
//				r1.compareTo(r2) == 0
//				)
//		{
//			out.print("-1");
//			out.flush();
//			return;
//		}
//		
//		//TODO: calculate points count
//		BigDecimal dx = x1.subtract(x2).abs();
//		BigDecimal dy = y1.subtract(y2).abs();
//		BigDecimal dd = dx.pow(2).add(dy.pow(2));
//		
//		BigDecimal a1 = null;
//		BigDecimal a2 = null;
//		BigDecimal a3 = null;
//
////		r1 = r1.pow(2);
////		r2 = r2.pow(2);
//		BigDecimal b = null;//a2.add(a3);
//		
//		if (dd.compareTo(r1.pow(2)) >= 0 && dd.compareTo(r2.pow(2)) >= 0){
//			a1 = dd;
//			a2 = r1;
//			a3 = r2;
//			b = a2.pow(2).add(a3.pow(2)).add(a2.multiply(a3).multiply(new BigDecimal("2")));
//		} else if (r1.pow(2).compareTo(dd) >= 0 && r1.compareTo(r2) >= 0){
//			a1 = r1;
//			a2 = r2;
//			a3 = dd;
//			b = a2.pow(2).add(a3.pow(2)).add(a2.multiply(a3).multiply(new BigDecimal("2")));
//		} else if (r2.pow(2).compareTo(dd) >= 0 && r2.compareTo(r1) >= 0){
//			a1 = r2;
//			a2 = r1;
//			a3 = dd;
//			b = a2.pow(2).add(a3.pow(2)).add(a2.multiply(a3).multiply(new BigDecimal("2")));
//		}
//		
////		BigDecimal b = a2.add(a3);
//
//		if (a1.compareTo(b) == 0)
//			out.println(1);
//		else if (a1.compareTo(b) == -1)
//			out.println(2);
//		else 
//			out.print(0);
		
		out.flush();
	}

}
