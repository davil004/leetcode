package leetcode;

public class leetcode2023 {

	class Solution {
		public int numOfPairs(String[] nums, String target) {
			int ans = 0;
			for (int i = 0; i < nums.length; i++) {

				for (int j = 0; j < nums.length; j++) {
					// System.out.println(nums[i]+nums[j]);
					String temp = nums[i] + nums[j];
					if (i != j && temp.equals(target)) {
						System.out.print("++");
						ans++;
					}
				}
			}
			return ans;
		}
	}

}
