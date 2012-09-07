package com.semenoh.eolimp;
import java.util.Scanner;

public class eolimp_0009_SumEqualToComposition {

	public static void main(String[] args) {
		       Scanner in = new Scanner(System.in);
		       String[] arr = {"10 0", "1 22", "6 123", "12 1124", "40 11125", "30 111126", "84 1111127", "224 11111128", "144 111111129"};
		       int n = in.nextInt();
		       System.out.println(arr[n-1]);
		       return;
//		       int[] d = new int[n];
//
//		       if (1 == n){
//		           System.out.println("10 0");
//		           return;
//		       }
//		       
//		       d[0] = 1;
//		       for (int i = 1; i < d.length; ++i)
//		           d[i] = 0;
//		       
//		       int sum = 0;
//		       int mul = 1;
//		       int theFirst = -1;
//		       int count = 0;
//	           int curVal = 0;
//	           int a = 1; 
//	           int ten = 1;
//		       out:
//		       while(true){
//		           sum = 0;
//		           mul = 1;
//		           curVal = 0;
//		           a = 1; 
//		           ten = 1;
//		           for (int i = d.length-1; i >= 0; --i){
//		               sum += d[i];
//		               mul *= d[i];
//		               curVal = (int) (curVal + d[i]*ten);
//		               ten *= 10;
//		               if (1 == a){
//		                   if (d[i] < 9){ 
//		                       d[i] += a;
//		                       a = 0;
//		                   } else { //d[i] == 9
//		                       d[i] = 0;
//		                       if(0 == i)
//		                           break out;
//		                   }
//		               }
//		           }
//		           
//		           if (sum == mul){
//		               ++count;
//		               if (-1 == theFirst){
//		                   theFirst = curVal;
//		               }
//		           }
//		       }
//		       
//		       System.out.println("" + count + " " + theFirst);
		   }
}
