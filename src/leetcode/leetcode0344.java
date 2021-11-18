package leetcode;

public class leetcode0344 {
	
	class Solution {
		public void reverseString(char[] s) {
			int len = s.length - 1;
			int head = 0;
			while (len > head) {
				char temp = s[len];
				s[len] = s[head];
				s[head] = temp;

				len--;
				head++;
			}
		}
	}

}
