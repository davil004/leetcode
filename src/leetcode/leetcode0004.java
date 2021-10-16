package leetcode;

import java.util.Arrays;

public class leetcode0004 {

	class Solution {
		public double findMedianSortedArrays(int[] nums1, int[] nums2) {

			int len1 = nums1.length;
			int len2 = nums2.length;
			int len = len1 + len2;
			int[] temp = new int[len1 + len2];
			int index = 0;
			for (int i = 0; i < len1; i++) {
				temp[index] = nums1[i];
				index++;
			}
			for (int i = 0; i < len2; i++) {
				temp[index] = nums2[i];
				index++;
			}
			Arrays.sort(temp);
			double ans = 0;

			if ((len) % 2 == 0) {

				ans = (temp[(len - 1) / 2] + temp[((len - 1) / 2) + 1]) / (double) 2;

			} else {

				ans = temp[(len - 1) / 2];

			}

			return ans;
		}
	}

}
