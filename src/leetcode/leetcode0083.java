package leetcode;

public class leetcode0083 {

	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
	 * ListNode next) { this.val = val; this.next = next; } }
	 */
	class Solution {
		public ListNode deleteDuplicates(ListNode head) {
			// ListNode temp =head;

			// System.out.println(head.val);

			if (head != null && head.next != null) {

				while (head.next != null && head.val == head.next.val) {
					head = head.next;
				}
				if (head != null && head.next != null) {

					head.next = deleteDuplicates(head.next);

				}

			}
			return head;
		}
	}

}
