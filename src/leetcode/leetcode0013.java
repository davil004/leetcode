package leetcode;

import java.util.HashMap;

public class leetcode0013 {

	class Solution {
		public int romanToInt(String s) {
			HashMap<String, Integer> map = new HashMap<>();
			map.put("I", 1);
			map.put("V", 5);
			map.put("X", 10);
			map.put("L", 50);
			map.put("C", 100);
			map.put("D", 500);
			map.put("M", 1000);

			int a = s.length();
			int ans = 0;
			for (int b = 0; b < a; b++) {

				String temp = s.charAt(b) + "";

				String temp2 = "I";
				if (b + 1 != a) {
					temp2 = s.charAt(b + 1) + "";
				}

				if (map.get(temp) >= map.get(temp2)) {
					ans = ans + map.get(temp);

				} else {
					ans = ans + map.get(temp2) - map.get(temp);
					b = b + 1;
				}
			}

			return ans;

		}
	}
}
