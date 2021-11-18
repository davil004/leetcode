package leetcode;

public class leetcode0557 {

	class Solution {
		public String reverseWords(String s) {
			String[] s1 = s.split(" ");
			int len1 = s1.length - 1;
			String ans = "";

			for (int i = 0; i <= len1; i++) {
				for (int j = s1[i].length() - 1; j >= 0; j--) {
					ans = ans + s1[i].charAt(j);
				}
				if (ans.length() < s.length()) {
					ans = ans + " ";
				}

			}
			return ans;
		}
	}

}
