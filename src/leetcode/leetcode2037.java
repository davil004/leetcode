package leetcode;

import java.util.Arrays;

public class leetcode2037 {

	class Solution {
		public int minMovesToSeat(int[] seats, int[] students) {
			Arrays.sort(seats);
			Arrays.sort(students);

			int ans = 0;
			for (int i = 0; i < seats.length; i++) {
				ans += (Math.abs(seats[i] - students[i]));
			}
			return ans;
		}
	}
}
