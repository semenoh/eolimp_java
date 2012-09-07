package com.semenoh.eolimp;
import java.util.Scanner;

public class eolimp_0075_PiratesAndCoins {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int m = in.nextInt();
		double d = Math.sqrt(Math.pow(2*a+1, 2) - 8*(a-m));
		int n = (int) ( d-2*a-1)/2+1;
		System.out.println(n);
	}
}
