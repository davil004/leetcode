package leetcode;

import java.util.Arrays;

public class leetcode0324 {

	class Solution {
		public void wiggleSort(int[] nums) {

			if (nums.length > 1) {
				int[] temp = new int[nums.length];
				Arrays.sort(nums);

				int j = 1;
				for (int i = 0; i < temp.length; i++) {

					temp[j] = nums[temp.length - i - 1];

					j += 2;
					if (j >= temp.length) {
						j = 0;
					}

				}

				for (int k = 0; k < temp.length; k++) {
					nums[k] = temp[k];
				}

			}

		}
	}

}
