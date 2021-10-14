package leetcode;

public class leetcode0067 {

	public static void main(String[] args) {

		class Solution {
			public String addBinary(String a, String b) {
				StringBuffer ans = new StringBuffer("");
				int a1 = a.length() - 1;
				int b1 = b.length() - 1;
				int temp = 0;
				while (a1 >= 0 || b1 >= 0 || temp > 0) {
					if (a1 >= 0) {
						temp = temp - '0' + a.charAt(a1);
					}
					if (b1 >= 0) {
						temp = temp - '0' + b.charAt(b1);
					}
					if (temp < 2) {
						ans.append(temp);
						temp = 0;
					}
					if (temp >= 2) {
						ans.append(temp - 2);
						temp = 1;
					}
					a1--;
					b1--;

				}

				return ans.reverse().toString();
			}
		}
	}

}
