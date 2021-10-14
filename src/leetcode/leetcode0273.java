package leetcode;

public class leetcode0273 {

	class Solution {
		public String numberToWords(int num) {
			if (num == 0) {
				return "Zero";
			}
			String s = "";
			for (int i = 1000000000; i > 0; i = i / 1000) {

				if (num >= i) {
					int b = num / i;

					if (b > 99) {
						switch (b / 100) {
						case 1:
							s = s + "One Hundred ";
							break;
						case 2:
							s = s + "Two Hundred ";
							break;
						case 3:
							s = s + "Three Hundred ";
							break;
						case 4:
							s = s + "Four Hundred ";
							break;
						case 5:
							s = s + "Five Hundred ";
							break;
						case 6:
							s = s + "Six Hundred ";
							break;
						case 7:
							s = s + "Seven Hundred ";
							break;
						case 8:
							s = s + "Eight Hundred ";
							break;
						case 9:
							s = s + "Nine Hundred ";
							break;
						}
					}
					b = b % 100;
					if (b < 20) {
						switch (b) {
						case 1:
							s = s + "One ";
							break;
						case 2:
							s = s + "Two ";
							break;
						case 3:
							s = s + "Three ";
							break;
						case 4:
							s = s + "Four ";
							break;
						case 5:
							s = s + "Five ";
							break;
						case 6:
							s = s + "Six ";
							break;
						case 7:
							s = s + "Seven ";
							break;
						case 8:
							s = s + "Eight ";
							break;
						case 9:
							s = s + "Nine ";
							break;
						case 10:
							s = s + "Ten ";
							break;
						case 11:
							s = s + "Eleven ";
							break;
						case 12:
							s = s + "Twelve ";
							break;
						case 13:
							s = s + "Thirteen ";
							break;
						case 14:
							s = s + "Fourteen ";
							break;
						case 15:
							s = s + "Fifteen ";
							break;
						case 16:
							s = s + "Sixteen ";
							break;
						case 17:
							s = s + "Seventeen ";
							break;
						case 18:
							s = s + "Eighteen ";
							break;
						case 19:
							s = s + "Nineteen ";
							break;
						}
					} else {
						switch (b / 10) {

						case 2:
							s = s + "Twenty ";
							break;
						case 3:
							s = s + "Thirty ";
							break;
						case 4:
							s = s + "Forty ";
							break;
						case 5:
							s = s + "Fifty ";
							break;
						case 6:
							s = s + "Sixty ";
							break;
						case 7:
							s = s + "Seventy ";
							break;
						case 8:
							s = s + "Eighty ";
							break;
						case 9:
							s = s + "Ninety ";
							break;
						}
						switch (b % 10) {
						case 1:
							s = s + "One ";
							break;
						case 2:
							s = s + "Two ";
							break;
						case 3:
							s = s + "Three ";
							break;
						case 4:
							s = s + "Four ";
							break;
						case 5:
							s = s + "Five ";
							break;
						case 6:
							s = s + "Six ";
							break;
						case 7:
							s = s + "Seven ";
							break;
						case 8:
							s = s + "Eight ";
							break;
						case 9:
							s = s + "Nine ";
							break;
						}
					}

					switch (i) {
					case 1000:
						s = s + "Thousand ";
						break;
					case 1000000:
						s = s + "Million ";
						break;
					case 1000000000:
						s = s + "Billion ";
						break;

					}

				}
				num = num % i;
			}
			String ans = s.substring(0, s.length() - 1);
			return ans;
		}
	}

}
