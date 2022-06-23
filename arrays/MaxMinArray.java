package arrays;

public class MaxMinArray {
	
	public static void main(String[] args){
		int[] array = {2,-1,4,9,7};
		System.out.println(maxValue(array));
		System.out.println(minValue(array));
	}
 // Max value
	static int maxValue(int[] array) {
		int temp = array[0];
		for (int i =0; i< array.length; i++){
			if (temp < array[i]){
				temp = array[i];
			}
			else{
				continue;
			}
		}
		return temp;
	}
	
//min value
	static int minValue(int[] array) {
		int temp = array[0];
		for (int i =0; i< array.length; i++){
			if (temp > array[i]){
				temp = array[i];
			}
			else{
				continue;
			}
		}
		return temp;
	}

}
