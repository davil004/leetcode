package leetcode;

public class leetcode0070 {

	class Solution {
		public int climbStairs(int n) {
			int a = 1;
			int b = 2;
			int temp = 0;
			if (n <= 2) {
				return n;

			} else {
				for (int i = 0; i < n - 2; i++) {
					temp = b;
					b = a + b;
					a = temp;
				}
				return b;
			}

		}

	}

}
