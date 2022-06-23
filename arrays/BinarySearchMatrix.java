package arrays;

import java.util.Arrays;

public class BinarySearchMatrix {

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3, 4 }, 
				          { 5, 6, 7, 8 },
				          { 9, 10, 11, 12 } };
		int[] res = findMember(array, 5);
		for (int result : res){
			System.out.print(result +" ");
		}
	}

	public static int[][] shortArrsay(int[][] array) {
		Arrays.sort(array);
		return array;
	}

	public static int[] findMember(int[][] array, int target) {
		int r = array.length, c = array[r - 1].length;

		if (r == 1) {
			return binarySearch(array, 0, 0, c - 1, target);
		}

		// run the loop till 2 rows are remaining
		int rStart = 0;
		int rEnd = r - 1;
		int cMid = c / 2;
		while (rStart < rEnd - 1) {
			int rMid = rStart + (rEnd - rStart) / 2;

			if (array[rMid][cMid] == target) {
				return new int[] { rMid, cMid };
			}

			else if (array[rMid][cMid] > target) {
				rEnd = rMid;
			} else {
				rStart = rMid;
			}
		}

		// While loop end -- only 2 row remains

		if (array[rStart][cMid] == target) {
			return new int[] { rStart, cMid };
		}

		else if (array[rEnd -1 ][cMid] == target) {
			return new int[] { rEnd, cMid };
		}

		// search in 1st half
		if (target <= array[rStart][cMid - 1]) {
			return binarySearch(array, rStart, 0, cMid -1, target);
		}

		// search in 2nd half
		if (target >= array[rStart][cMid + 1] && target <= array[rStart][c-1]) {
            return binarySearch(array, rStart, cMid +1, c -1, target);
		}
		// search in 3rd half
		if (target <= array[rStart+1][cMid - 1] && target >= array[rStart+1][0]) {
			return binarySearch(array, rStart+1, 0, cMid -1, target);
		}
		// search in 4th half
		if (target >= array[rStart+1][cMid + 1]) {
			return binarySearch(array, rStart + 1, cMid -1, c -1, target);
		}
		else{
			return new int[] {-1, -1};
		}

	}

	// Search in the row between columns provided
	static int[] binarySearch(int[][] arr, int row, int colStart, int colEnd, int target) {
		while (colStart <= colEnd) {
			int mid = colStart + (colEnd - colStart) / 2;

			if (arr[row][mid] == target) {
				return new int[] { row, mid };
			}

			else if (arr[row][mid] > target) {
				colStart = mid + 1;
			} else {
				colEnd = mid - 1;
			}
		}

		return new int[] { -1, -1 };
	}

}
