package leetcode;

public class leetcode0007 {

	public static void main(String[] args) {

		class Solution {
			public int reverse(int x) {

				int x1 = Math.abs(x);
				String x2 = Integer.toString(x1);
				int a = (x2.length()) - 1;
				String ans = "";
				if (x1 < 0)
					return 0;
				if (x < 0) {
					ans = ans + "-";
				}

				for (int b = 0; b <= a; b++) {
					ans = ans + (x2.charAt(a - b));
				}

				long ans2 = Long.parseLong(ans);

				if (ans2 > Integer.MAX_VALUE || ans2 < Integer.MIN_VALUE) {
					return 0;
				} else {

					return Integer.parseInt(ans);

				}
			}
		}
	}

}
