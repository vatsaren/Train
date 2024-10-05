package task1.utils;

public class ListNode {
	public int val;
	public ListNode next = null;

	public ListNode() {}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public static boolean equals(ListNode l1, ListNode l2) {
		while (l1.next != null) {
			if (l1.val != l2.val) {
				return false;
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		if (l1.val != l2.val) {
			return false;
		}
		return l2.next == null;
	}
}
