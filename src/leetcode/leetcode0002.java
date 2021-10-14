package leetcode;

public class leetcode0002 {

	public static void main(String[] args) {


		/**
		 * Definition for singly-linked list.
		 * public class ListNode {
		 *     int val;
		 *     ListNode next;
		 *     ListNode() {}
		 *     ListNode(int val) { this.val = val; }
		 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 * }
		 */
		class Solution {
		    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		       
		        int temp =l1.val+l2.val;
		        ListNode ans =new ListNode(0);
		        ListNode ans2 =new ListNode(1);

		        if(temp<10){
		            if(l2==null&&l1.val==0 && l1.next==null){                
		                return l2;
		            }
		            if(l1==null&&l2.val==0 && l2.next==null){               
		                return l1;
		            }
		        }
		               
		        if(temp>=10){            
		            temp=temp-10;
		            if(l1.next != null &&l2.next !=null){
		                System.out.println("OO01");
		                l1.next.val=l1.next.val+1;
		                ans.next =new ListNode(temp,addTwoNumbers(l1.next, l2.next));

		            }else if(l1.next == null&&l2.next !=null){              
		                ans.next =new ListNode(temp, addTwoNumbers(ans2, l2.next));

		            }else if(l2.next == null&&l1.next !=null){          
		                ans.next =new ListNode(temp, addTwoNumbers(ans2, l1.next));

		            }else{               
		                ans.next =new ListNode(temp, ans2);
		            }
		        }else{
		            
		            if(l1.next != null &&l2.next !=null){
		            ans.next =new ListNode(temp,addTwoNumbers(l1.next, l2.next));

		            }else if(l1.next == null){
		                ans.next =new ListNode(temp, l2.next);

		            }else if(l2.next == null){
		                ans.next =new ListNode(temp, l1.next);
		            }
		        }
		                
		        return ans.next;
		    }
		}
	}

}
