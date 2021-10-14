package leetcode;

public class leetcode1208 {

	class Solution {
		public int equalSubstring(String s, String t, int maxCost) {
			int ans = 0;
			int[] temp = new int[s.length()];

			for (int i = 0; i < s.length(); i++) {
				temp[i] = Math.abs(s.charAt(i) - t.charAt(i));
			}

//		        -------

			for (int k = 0; k < s.length(); k++) {
				int ans2 = 0;
				int sum = 0;
				for (int j = k; sum <= maxCost && j < s.length(); j++) {

					sum = sum + temp[j];
					ans2++;
				}
				if (sum > maxCost) {
					ans2--;
				}

				if (ans2 > ans) {
					ans = ans2;
				}

			}
			return ans;
		}

	}

}
