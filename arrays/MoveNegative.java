package arrays;

import java.util.Arrays;

public class MoveNegative {

	// sort the array
	/**
	 * public static void sortArray(int[] arr){ Arrays.sort(arr); }
	 **/

	//Rearrange using temp
	/**
	public static void rearrange(int[] array) {
		int temp, j = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				if (i != j) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
				j++;
			}
		}
	}
	**/
	
	public static void shiftArray(int left, int right, int[] array) {
		while(left <= right){
			if (array[left] < 0 && array[right] < 0){
				left++;
			}
			
			else if(array[left] < 0 && array[right]>0) {
				right--;
				
			}
			else if(array[left] > 0 && array[right]<0){
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				left++;
				right--;
			}
			//array[left] > 0 && array[right]>0
			else {
				left++;
				right--;

			}
		}
		
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] array = { -1, 4, 5, -2, -1, 0, -5, -10 };
		shiftArray(0, (array.length - 1), array);
		// sortArray(array);
		//rearrange(array);
		printArray(array);
	}

}
