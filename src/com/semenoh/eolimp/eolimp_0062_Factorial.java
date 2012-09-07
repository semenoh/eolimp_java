package com.semenoh.eolimp;
import java.math.BigInteger;
import java.util.Scanner;


public class eolimp_0062_Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = new BigInteger(in.next());
		if (n.equals(BigInteger.ONE)){
			System.out.println(1);
			return;
		}
		int i = 1;
		for (; n.compareTo(BigInteger.ONE) == 1; i++)
			n = n.divide(new BigInteger(Integer.toString(i)));
		System.out.println(--i);
	}

}
