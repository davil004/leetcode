package leetcode;

public class leetcode0011 {

	class Solution1 {
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

	class Solution2 {
		public int maxArea(int[] height) {
			int len = height.length;
			int ans = 0;
			int i = 0;
			int j = len - 1;

			while (i < j) {
				int temp = 0;
				temp = (j - i) * Math.min(height[i], height[j]);
				ans = Math.max(ans, temp);
				if (height[i] > height[j]) {
					j--;
				} else {
					i++;
				}

			}
			return ans;
		}
	}

}
