package leetcode;

import java.util.Stack;

public class leetcode0020 {

	public static void main(String[] args) {
		class Solution {
			public boolean isValid(String s) {

				Stack<Character> st = new Stack<>();

				if (s.length() != 0) {

					for (int i = 0; i < s.length(); i++) {
						if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
							st.push(s.charAt(i));
						} else if (st.empty() == false) {
							if (s.charAt(i) == ')' & st.peek() == '(') {
								st.pop();
							} else if (s.charAt(i) == ']' & st.peek() == '[') {
								st.pop();
							} else if (s.charAt(i) == '}' & st.peek() == '{') {
								st.pop();
							} else
								st.push(s.charAt(i));
						} else
							st.push(s.charAt(i));

					}

				}
				return st.empty();
			}
		}

	}

}
