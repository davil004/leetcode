package leetcode;

public class leetcode0826 {

	class Solution {
		public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
			int ans = 0;
			for (int i = 0; i < worker.length; i++) {
				int temp = 0;
				for (int j = 0; j < profit.length; j++) {
					if (worker[i] >= difficulty[j]) {
						temp = Math.max(temp, profit[j]);
					}

				}
				ans += temp;
			}

			return ans;
		}
	}

}
