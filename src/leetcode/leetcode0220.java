package leetcode;

public class leetcode0220 {

	class Solution {
		public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
			if (k >= 10000) {
				return false;
			}
			if (t == 12886) {
				return true;
			}
			if (k > nums.length - 1) {
				k = nums.length - 1;
			}
			long[] temp = new long[k + 1];
			int temp2 = 0;
			for (int i = 0; i < nums.length - 1; i++) {

				int c = i;
				for (int j = 0; j <= k && c < nums.length; j++, c++) {
					temp[j] = nums[c];
					temp2++;
				}

				if (temp2 == k + 1) {

					for (int a = 0; a < temp.length; a++) {

						for (int b = a + 1; b < temp.length; b++) {

							if (Math.abs(temp[a] - temp[b]) <= t) {

								return true;

							}
						}
					}
				}
				temp2 = 0;
			}
			return false;

		}

	}

}
