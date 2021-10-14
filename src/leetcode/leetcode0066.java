package leetcode;

public class leetcode0066 {

	class Solution {
		public int[] plusOne(int[] digits) {

			int a = digits.length - 1;

			boolean b = true;
			for (int i = 0; i < a; i++) {
				if (digits[i] != 9) {
					b = false;
				}
			}

			if (digits[a] != 9) {
				digits[a] = digits[a] + 1;
				return digits;

			} else if (b) {
				int[] ans = new int[a + 2];
				ans[0] = 1;
				return ans;

			} else {

				int[] ans = new int[a + 1];
				digits[a] = digits[a] + 1;

				for (int j = a; j >= 0; j--) {
					ans[j] = ans[j] + digits[j];

					if (ans[j] == 10) {
						ans[j] = 0;
						ans[j - 1] = ans[j - 1] + 1;

					}

				}

				return ans;
			}

		}
	}

}
