package leetcode;

import java.util.Arrays;

public class leetcode1005 {

	class Solution {
		public int largestSumAfterKNegations(int[] nums, int k) {
			int ans = 0;
			Arrays.sort(nums);
			for (int i = 0; i < k; i++) {
				nums[0] *= -1;
				Arrays.sort(nums);
			}

			for (int j = 0; j < nums.length; j++) {
				ans += nums[j];
			}
			return ans;
		}
	}

}
