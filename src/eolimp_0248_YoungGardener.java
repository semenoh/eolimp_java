
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Young gardener
 * 
 * Mom asked Vasya pour all the young trees in the garden.
 * Vasya knows that while trees are small, they must be very well watered. 
 * But how much to water - is unknown. 
 * But Vasya - a very clever boy. He carefully read the entire textbook 
 * of botany for secondary schools and found that irrigation is 
 * directly proportional to the number of leaves on the tree. 
 * For a good tree growth enough to pour under the tree every day 
 * for one liter of water for each sheet. 
 * 
 * Fortunately Wasi was found that the leaves on the trees are growing in tiers, 
 * with the upper tier of two sheets, the second - four at the next - six, and so on, 
 * at each successive layer of two sheets of more than the previous one. 
 * And at the very tip of growing another leaf. 
 * Sly Vasya sent her younger sister Masha count the number of tiers for each tree, 
 * and asks you to write a program that for each tree compute the number of liters of water for its irrigation.
 * 
 * Specifications
 * Input  
 * In the input file is written the number N (0 ≤ N ≤ 1000) - the number of tiers in the tree.
 * 
 * Output
 * Display the number of liters of water for watering the tree.
 * 
 * 
 * Problem information
 * Time Limit: 1 seconds
 * Memory Limit: 64 MB
 * Balls for the passed test: 5.88235
 * Complexity: 5% 566/596
 * 
 * Example
 * Example input
 * 3
 * Example output
 * 13
 */

/**
 * @author oleg.semen
 *
 */
public class eolimp_0248_YoungGardener {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		  PrintWriter out = new PrintWriter(System.out);

		  int n = in.nextInt();
		  BigInteger k = new BigInteger(Integer.toString(n));
		  k = k.add(k.pow(2)).add(new BigInteger("1"));
		  out.println(k);

		  out.flush();
	}

}
