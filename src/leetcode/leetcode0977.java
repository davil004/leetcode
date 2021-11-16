package leetcode;

public class leetcode0977 {

	class Solution {
		public int[] sortedSquares(int[] nums) {
			int len = nums.length - 1;
			int head = 0;
			int[] ans = new int[len + 1];
			for (int i = len; i >= 0; i--) {

				if (nums[len] * nums[len] > nums[head] * nums[head]) {
					ans[i] = nums[len] * nums[len];
					len--;
				} else {
					ans[i] = nums[head] * nums[head];
					head++;
				}

			}
			return ans;
		}
	}

}
