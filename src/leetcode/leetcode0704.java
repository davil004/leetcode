package leetcode;

public class leetcode0704 {

	class Solution {
		public int search(int[] nums, int target) {
			int a = 0;
			int b = nums.length - 1;

			if (nums[a] > target || nums[b] < target) {
				return -1;

			}
			while (a <= b) {
				int i = a + (b - a) / 2;
				if (nums[i] < target) {
					a = i + 1;
				} else if (nums[i] > target) {
					b = i - 1;
				} else {
					return i;
				}
			}

			return -1;
		}
	}

}
