package leetcode;

public class leetcode0058 {

	public static void main(String[] args) {
		class Solution {
			public int lengthOfLastWord(String s) {

				return (s.split(" ")[s.split(" ").length - 1]).length();
			}
		}

	}

}
