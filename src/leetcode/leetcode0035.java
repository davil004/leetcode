package leetcode;

public class leetcode0035 {

	class Solution {
		public int searchInsert(int[] nums, int target) {
			int ans = 0;
			for (int i = 0; i < nums.length; i++) {
				if (target > nums[i]) {
					ans++;
				}
			}

			return ans;
		}

	}
	class Solution2 {
	    public int searchInsert(int[] nums, int target) {
	        int head =0 ;
	        int tail = nums.length-1;
	        

	if(nums[0]>target) return 0;
	if(nums[tail]<target) return tail+1;

	       while(head<tail){

	           int ans = head+(tail-head)/2;

	            if(nums[ans]>target){
	                if(nums[ans-1]<target){
	                    return ans;
	                }
	                tail=ans;

	            }else if(nums[ans]<target){
	                 if(nums[ans+1]>=target){
	                    return ans+1;
	                }
	                head =ans;

	            }else{
	                return ans;
	            }

	       }


	        return 0;
	    }
	}

}
