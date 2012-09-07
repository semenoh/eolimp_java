package com.semenoh.eolimp;
import java.util.Scanner;


public class eolimp_2385_Permutations {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int rez = 1;
		for (int i = 1; i <= n; ++i)
			rez *= i;
		System.out.println(rez);
	}

}
