package leetcode;

public class leetcode0014 {

	class Solution {
		public String longestCommonPrefix(String[] strs) {

			String ans = "";

			if (strs.length == 1) {
				ans = strs[0];
			}

			if (strs[0] != "") {

				ans = strs[0];

				for (int i = 1; i < strs.length; i++) {

					while (strs[i].indexOf(ans) != 0) {
						ans = ans.substring(0, ans.length() - 1);

					}

				}
			}
			return ans;
		}

	}

}
