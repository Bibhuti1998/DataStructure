package arrays;

public class ReverseArray {
	
	// reverse the array
	static void reverseArray(int arr[],int start,int end){
		int temp;
		
//		while (start < end){
//			temp = arr[end];
//            arr[end] = arr[start];
//            arr[start] = temp;
//            start++;
//            end--;
//		}
		
		if (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++ ; end--;
			reverseArray(arr,start,end);
		}
	}
	
	//print the array
	static void printArray(int[] array){
		
		for (int i = 0; i < array.length ; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void main (String[] args){
		int[] array = {1,2,3,4,5};
		printArray(array);
		int start = 0; int end = array.length -1;
		reverseArray(array,start,end);
		System.out.println("Reversed one");
		printArray(array);
		
	}

}
