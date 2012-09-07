package com.semenoh.eolimp;
import java.util.Scanner;
import java.util.Stack;

public class eolimp_2479_Braces {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = 0;
		try{
			n = in.nextInt();

		} catch (Exception e){
			//
		}
		String s = in.nextLine();
		for (int k = 0; k < n; ++k) {
			try{
				s = in.nextLine();
			System.out.println(chek(s) ? "Yes" : "No");
			} catch (Exception e){System.out.println("Yes");}
		}
	}

	static boolean chek(String s) {
		if (null == s)
			return false;
		Stack<Character> stack = new Stack<Character>();
		char c = ' ';
		for (int i = 0; i < s.length(); ++i) {
			try{
				c = s.charAt(i);
			}catch (Exception e){
				//
			}

			switch (c){
			case '(' :
				stack.add(')');
				break;
			case '[' :
				stack.add(']');
				break;
			case ']' :
			case ')' :
				if (stack.isEmpty() || c != stack.lastElement())
					return false;
				else
					try{
						stack.pop();
					} catch (Exception e){}
			default :
				;
			}
		}

		return stack.isEmpty();
	}
}