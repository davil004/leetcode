package leetcode;

public class leetcode0053 {

	class Solution {
		public int maxSubArray(int[] nums) {
			int ans = nums[0];
			int temp = 0;

			for (int i = 0; i < nums.length; i++) {
				temp = temp + nums[i];
				if (ans < temp) {
					ans = temp;
				}
				if (temp < 0) {
					temp = 0;
				}

			}

			return ans;
		}
	}

}
