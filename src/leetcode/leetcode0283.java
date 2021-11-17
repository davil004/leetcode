package leetcode;

public class leetcode0283 {

	class Solution {
		public void moveZeroes(int[] nums) {
			int[] temp = new int[nums.length];
			int a = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] != 0) {
					temp[a] = nums[i];
					a++;
				}
			}
			System.arraycopy(temp, 0, nums, 0, nums.length);
		}
	}

}
