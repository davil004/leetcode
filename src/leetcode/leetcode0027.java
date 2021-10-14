package leetcode;

public class leetcode0027 {

	class Solution {
		public int removeElement(int[] nums, int val) {
			int ans = 0;
			int temp = 0;
			if (nums != null && nums.length > 0) {
				for (int i = 0; i < nums.length; i++) {
					if (nums[i] != val) {
						temp = nums[i];
						nums[ans] = temp;
						ans++;
					}
				}
			}
			return ans;
		}

	}

}
