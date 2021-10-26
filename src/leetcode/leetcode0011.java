package leetcode;

public class leetcode0011 {

	class Solution {
		public int maxArea(int[] height) {
			int len = height.length;
			int ans = 0;

			for (int i = 0; i < len; i++) {
				if (height[i] * (len - i) > ans) {
					for (int j = 0; i + j < len; j++) {
						int temp = 0;
						temp = Math.min(height[i], height[i + j]);
						ans = Math.max(ans, temp * j);

					}
				}
			}
			return ans;
		}
	}

}
