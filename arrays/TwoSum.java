package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Solution sol = new Solution();
		int[] input = { 7, 9, 6, 8, 4, 2 };
		int[] res = twoSum(input, 9);
	}

	public static int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return new int[0];

		Map<Integer, Integer> numToIdx = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			Integer idx = numToIdx.get(target - nums[i]);
			if (idx != null) {
				return new int[] { idx, i };
			}
			numToIdx.put(nums[i], i);
		}
		return new int[0];
	}

}
