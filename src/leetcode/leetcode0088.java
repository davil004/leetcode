package leetcode;

public class leetcode0088 {

	class Solution {
		public void merge(int[] nums1, int m, int[] nums2, int n) {
			int a = m + n;
			int[] ans = new int[a];

			for (int j = 0; j < a; j++) {
				if (m > 0 && n > 0 && nums1[m - 1] >= nums2[n - 1]) {
					ans[a - j - 1] = nums1[m - 1];
					m--;
				} else if (n > 0 && m > 0 && nums2[n - 1] >= nums1[m - 1]) {
					ans[a - j - 1] = nums2[n - 1];
					n--;

				} else if (n == 0 && m != 0) {
					ans[a - j - 1] = nums1[m - 1];
					m--;
				} else if (m == 0 && n != 0) {
					ans[a - j - 1] = nums2[n - 1];
					n--;
				}
			}

			for (int i = 0; i < a; i++) {
				nums1[i] = ans[i];
			}

		}
	}

}
