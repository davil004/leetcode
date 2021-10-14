package leetcode;

public class leetcode0441 {

	class Solution {
		public int arrangeCoins(int n) {
			long temp = 0;
			int ans = 0;
			for (int i = 1; temp < n; i++) {
				temp = temp + i;
				ans++;
			}
			if (temp > n) {
				ans--;
			}
			return ans;
		}

	}

}
