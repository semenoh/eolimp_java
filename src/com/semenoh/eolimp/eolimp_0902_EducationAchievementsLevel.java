package com.semenoh.eolimp;
import java.util.Scanner;


public class eolimp_0902_EducationAchievementsLevel {

	public static void main(String[] args) {
		String[] level = {"Initial", "Average", "Sufficient", "High"};
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(level[(n-1)/3]);
	}

}
