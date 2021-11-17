package leetcode;

public class leetcode0167 {

	class Solution {
		public int[] twoSum(int[] numbers, int target) {
			int a = 0;
			int b = numbers.length - 1;
			while (numbers[a] + numbers[b] != target) {
				if (numbers[a] + numbers[b] > target) {
					b--;
				} else {
					a++;
				}
			}

			int[] ans = { a + 1, b + 1 };
			return ans;
		}
	}

}
