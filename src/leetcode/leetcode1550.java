package leetcode;

public class leetcode1550 {

	class Solution {
		public boolean threeConsecutiveOdds(int[] arr) {

			int len = arr.length;
			for (int i = 0; i <= len - 3; i++) {
				int j = 0;
				while (j < 3 && arr[i + j] % 2 == 1) {
					j++;
					if (j == 3) {
						return true;
					}
				}
			}
			return false;
		}
	}

}
