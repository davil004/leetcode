package leetcode;

public class leetcode0278 {

	/*
	 * The isBadVersion API is defined in the parent class VersionControl. boolean
	 * isBadVersion(int version);
	 */

	public class Solution extends VersionControl {
		public int firstBadVersion(int n) {
			int a = 1;

			if (isBadVersion(a) == true) {
				return a;
			}
			if (isBadVersion(n - 1) == false) {
				return n;
			}

			while (a < n) {

				int b = a + (n - a) / 2;

				if (isBadVersion(b) == true) {
					if (isBadVersion(b - 1) == false) {
						return b;
					} else {
						n = b - 1;
					}
				} else {
					a = b + 1;
				}

			}
			return n;
		}
	}

}
