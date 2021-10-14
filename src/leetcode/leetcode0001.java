package leetcode;

public class leetcode0001 {

	class Solution {
		public int[] twoSum(int[] nums, int target) {
			int a, b;
			int[] ans = new int[2];
			for (a = 0; a < nums.length; a++) {
				for (b = a + 1; b < nums.length; b++) {
					if ((nums[a] + nums[b]) == target) {
						ans[0] = a;
						ans[1] = b;
						return ans;
					}
				}
			}
			return ans;
		}
	}

}
