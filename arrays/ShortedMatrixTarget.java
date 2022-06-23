package arrays;

public class ShortedMatrixTarget {
	
	public static void main(String args[]){
		int[][] matrix = {{10,20,30,40},
			              {13,25,35,45},
			              {28,29,37,49},
			              {33,34,38,50}};
		int target = 101;
		int[] result = targetFound(matrix, target);
		System.out.println((result[0]+1) +" "+(result[1]+1));
		
	}
	
	static int[] targetFound(int[][] matrix, int target){
	    
		int r = 0;
		int c = matrix.length - 1;
		
		while (r < matrix.length && c>= 0){
			if (matrix[r][c] == target){
				return new int[] {r,c};
			}
			else if (matrix[r][c] < target){
				r = r+1;
			}
			else{
				c = c-1;
			}
		}
		return new int[]{-2,-2};
		
	}

}
