package leetcode;

public class leetcode0767 {

	class Solution {
	    public String reorganizeString(String s) {
	        char[] temp = s.toCharArray();
			int[] abc = new int[26];
			int l = s.length();

			int max = 0;
			int maxabc = 0;

			for (int i = 0; i < l; i++) {

				abc[temp[i] - 'a']++;

				if (abc[temp[i] - 'a'] > max) {
					max = abc[temp[i] - 'a'];
					maxabc = temp[i] - 'a';
				}
			}
			if (max * 2 > l + 1) {
				return "";
			}

			char[] ans = new char[l];
			int index = 0;

			while (abc[maxabc]-- > 0) {
				ans[index] = (char) (maxabc + 'a');
				index += 2;
				
			}
			for (int j = 0; j < 26; j++) {
				while (abc[j]-- > 0) {
					if (index >= l) {
						index = 1;
					}
					ans[index] = (char) (j + 'a');
					index += 2;
				}

			}

			return new String(ans);
	    }
	}

}
