package leetcode;

public class leetcode0069 {

	public static void main(String[] args) {

		class Solution {
			public int mySqrt(int x) {
				long ans = 0;
				if (x == 0) {

					return (int) ans;

				} else {

					while (ans == 0 || (ans * ans) <= x) {
						ans++;

					}

					return ((int) ans) - 1;
				}
			}
		}
	}

}
