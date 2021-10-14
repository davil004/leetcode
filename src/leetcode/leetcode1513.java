package leetcode;

public class leetcode1513 {

	public static void main(String[] args) {

	}

	class Solution {
		public int numSub(String s) {
			long ans = 0;
			String[] temp = s.split("0");

			for (int i = 0; i < temp.length; i++) {

				if (temp[i] != null) {
					long b = temp[i].length();
					ans = ans + (b * (b + 1) / 2);
				}

			}
			return (int) (ans % 1000000007);
		}
	}
}
