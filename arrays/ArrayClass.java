package arrays;

import java.util.Arrays;

public class ArrayClass {
	
	 public static void main(String args[]) 
	    {
		 
		 int i = 1;
		 if (i == 2) {
			System.out.println("if");
		}
		 else if (i < 2) {
			int x= 5;
			int y = 6;
			x = (x+y);
			y = x-y;
			x= x-y;
			System.out.println(x+" "+y);
		}
		 else {
			 System.out.println("else");
		}
	 }
 }
