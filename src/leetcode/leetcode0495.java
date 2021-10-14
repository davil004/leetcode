package leetcode;

public class leetcode0495 {

	public static void main(String[] args) {
		class Solution {
			public int findPoisonedDuration(int[] timeSeries, int duration) {
				int a = timeSeries.length;
				if (a == 1) {
					return duration;
				}
				int ans = 0;
				if (a > 1) {
					for (int i = 0; i < a - 1; i++) {
						int b = timeSeries[i + 1] - timeSeries[i];
						if (b < duration) {
							ans = ans + b;
						} else if (b >= duration) {
							ans = ans + duration;
						}

					}
					ans = ans + duration;
				}

				return ans;

			}
		}

	}

}
