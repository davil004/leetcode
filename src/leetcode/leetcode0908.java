package leetcode;

public class leetcode0908 {

	class Solution {
		public int smallestRangeI(int[] nums, int k) {
			if (nums.length == 1) {
				return 0;
			}

			int temp = nums[0];
			int temp2 = nums[0];
			for (int i = 1; i < nums.length; i++) {
				if (nums[i] > temp) {
					temp = nums[i];
				}
				if (nums[i] < temp2) {
					temp2 = nums[i];
				}
			}
			if (temp - temp2 < k * 2) {
				return 0;
			} else {
				return temp - temp2 - (k * 2);
			}

		}

	}

}
