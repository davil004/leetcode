package leetcode;

public class leetcode0852 {

	public static void main(String[] args) {
		class Solution {
			public int peakIndexInMountainArray(int[] arr) {
				int ans = 0;
				for (int i = 0; arr[i] < arr[i + 1]; i++) {
					ans++;
					System.out.println(ans);
				}
				return ans;
			}
		}

	}

}
