package leetcode;

public class leetcode0905 {

	class Solution {
	    public int[] sortArrayByParity(int[] nums) {
	        int len = nums.length;
	        int[] ans = new int[len];
	        int index =0;
	        int indexb = len-1;
	        for(int i =0 ;i<len;i++){
	            if(nums[i]%2==0){
	                ans[index]=nums[i];
	                index++;
	            }else{
	                ans[indexb]=nums[i];
	                indexb--;
	            }
	        }
	        return ans;
	    }
	}

}
