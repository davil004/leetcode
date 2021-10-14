package leetcode;

public class leetcode0009 {

	public static void main(String[] args) {
		class Solution {
			public boolean isPalindrome(int x) {
				boolean c = false;
				if (x < 0) {
					c = false;
				} else if (x < 10 & x >= 0) {
					c = true;
				} else {

					String a = Integer.toString(x);
					int b = a.length() - 1;

					for (int d = 0; d < (b - d); d++) {
						if (a.charAt(d) == a.charAt(b - d)) {
							c = true;
						} else {
							c = false;
							break;
						}
					}

				}
				return c;
			}
		}

	}

}
