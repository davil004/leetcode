package leetcode;

public class leetcode0003 {

	class Solution {
		public int lengthOfLongestSubstring(String s) {
			int len = s.length();

			int ans = 0;
			char[] temp = s.toCharArray();

			for (int i = 0; i < len; i++) {
				int[] alpha = new int[128];
				int k = 0;
				for (int j = i; j < len && k == 0; j++) {
					alpha[temp[j]]++;
					k = 0;
					if (alpha[temp[j]] < 2) {
						ans = Math.max(ans, j - i + 1);
					} else {
						k++;
					}

				}
			}
			return ans;

		}
	}

}
