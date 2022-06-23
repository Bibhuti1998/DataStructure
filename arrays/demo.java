package arrays;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		pattern(i);
	}

	public static void pattern(int i) {
		int k = 1;
		while (k < i) {
			for (int j = 1; j <= k; j++) {
				System.out.print("*");
			}
			System.out.println("");
			k++;
		}
	}
	
	public static void pattern2(int i){
		
	}

}
