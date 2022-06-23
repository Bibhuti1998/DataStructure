package arrays;

class Solution {
	public static void main(String[] args) {
		int[] array = {5,4,-1,7,8};
		System.out.println(maxSubArray(array));
	}
    public static int maxSubArray(int[] nums) {
        for (int i = 0; i < nums.length ; i++){
            for (int j= i+1; j < nums.length ; j++){
                if (nums[i] > nums[j]){
                    nums[i] = nums[i] * nums[j];
                    nums[j] = nums[i] / nums[j];
                    nums[i] = nums[i] /nums[j];
                }
            }
        }
        for (int k = nums.length - 1; 0 <= k; k--){
            if (k == 0){
                return nums[0];
            }
            else if (nums [k-1] < nums[k]){
                return nums [k-1] + nums[k];
            }
            
        }
        return 0;
    }
}