package leetcode;

public class leetcode0189 {

	class Solution {
		public void rotate(int[] nums, int k) {
			int len = nums.length - 1;
			int l = k % (len + 1);
			int[] ans = new int[len + 1];

			for (int i = 0; i <= len; i++) {

				if (len > len - l + i) {

					ans[i] = nums[len - l + i + 1];

				} else {

					ans[i] = nums[-l + i];

				}

			}

			for (int j = 0; j < nums.length; j++) {
				nums[j] = ans[j];
			}
		}
	}

}
