package com.semenoh.eolimp;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author oleg.semen
 *
 */
public class eolimp_2671_Miner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();
		int w = in.nextInt();

		int[][] a = new int[n][m];
		for(int i = 0; i < w; ++i){
			int x = in.nextInt();
			int y = in.nextInt();
			a[x-1][y-1] = -1;
		}
		
		for(int row = 0; row < n; ++row){
			for (int col = 0; col < m; ++col){
					if (-1 != a[row][col]){
					int cellNum = 0;
					try { if(-1 == a[row-1][col-1]) ++cellNum; } catch (ArrayIndexOutOfBoundsException e){}
					try { if(-1 == a[row-1][col]  ) ++cellNum; } catch (ArrayIndexOutOfBoundsException e){}
					try { if(-1 == a[row-1][col+1]) ++cellNum; } catch (ArrayIndexOutOfBoundsException e){}
					try { if(-1 == a[row]  [col+1]) ++cellNum; } catch (ArrayIndexOutOfBoundsException e){}
					try { if(-1 == a[row+1][col+1]) ++cellNum; } catch (ArrayIndexOutOfBoundsException e){}
					try { if(-1 == a[row+1][col]  ) ++cellNum; } catch (ArrayIndexOutOfBoundsException e){}
					try { if(-1 == a[row+1][col-1]) ++cellNum; } catch (ArrayIndexOutOfBoundsException e){}
					try { if(-1 == a[row]  [col-1]) ++cellNum; } catch (ArrayIndexOutOfBoundsException e){}

					a[row][col] = cellNum;
					System.out.format(Locale.US, "%d", cellNum);
					if (col != m-1)
						System.out.format(Locale.US, " ");
				}else{
					System.out.format(Locale.US, "*");
					if (col != m-1)
						System.out.format(Locale.US, " ");
				}
			}
			if (row != n-1)
				System.out.println();
		}
	}
}
