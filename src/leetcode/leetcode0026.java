package leetcode;

public class leetcode0026 {

	public static void main(String[] args) {
		class Solution {
			public int removeDuplicates(int[] nums) {
				int ans = 0;
				int temp = 0;

				if (nums != null && nums.length > 0) {

					for (int i = 0; i < nums.length; i++) {

						if (temp != nums[i] || i == 0) {

							temp = nums[i];
							nums[ans] = temp;
							ans++;
						}

					}
				}
				return ans;
			}
		}

	}

}
