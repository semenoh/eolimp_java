package com.semenoh.eolimp;
import java.util.Scanner;

public class eolimp_2619_LuckyTicket {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] a = new int[n];
		long sum1 = 0;
		long sum2 = 0;
		
		int i = 0;
		
		for (i = 0; i < n/2; ++i){
			a[i] = in.nextInt();
			sum1 += a[i];
		}
		
		for ( ; i < n; ++i){
			a[i] = in.nextInt();
			sum2 += a[i];
		}
		
		if (sum1 == sum2){
			System.out.println(n/2);
			return;
		}

		int d = (int) (n/2 + (sum2 - sum1));
		
		if (sum1 < sum2){
			for (i = n/2; i < d; ++i){
				sum1 += a[i];
				sum2 -= a[i];
				if (sum1 == sum2){
					System.out.println(i+1);
					return;
				}
			}
		}
		
		d = (int) (n/2 - (sum1 - sum2));
		
		if (sum1 > sum2){
			for (i = n/2-1; i > d; --i){
				sum1 -= a[i];
				sum2 += a[i];
				if (sum1 == sum2){
					System.out.println(i);
					return;
				}
			}
		}
		
		System.out.println("-1");

	}

}
