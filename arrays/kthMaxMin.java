package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class kthMaxMin {
	
	public static Integer largestKthNumber(int[] array, int k){
		Arrays.sort(array);
		return array[k-1];
	}
	
	public static Integer smallestKthNumber(int[] array, int k){
		Arrays.sort(array);
		return array[array.length - (k)];
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = {1,2,3,4,5,6,7,8,9};
		System.out.println("k = ");
		int k = sc.nextInt();
		if(array.length >= k){
		System.out.println("Smallest "+k+"th number : "+smallestKthNumber(array, k));
		System.out.println("Largest "+k+"th number : "+largestKthNumber(array, k));}
		else{
			System.out.println(k + " is larger than length");
		}
	}

}
