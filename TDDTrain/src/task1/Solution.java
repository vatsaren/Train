package task1;

import task1.utils.ListNode;

public class Solution {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1.val == 0) {
			return l2;
		}
		if (l2.val == 0) {
			return l1;
		}
		ListNode resultNode;
		ListNode currentNode;
		int addVal = 0;
		if (l1.val + l2.val == 10) {
			l1 = l1.next;
			l2 = l2.next;
			resultNode = new ListNode(1);
			currentNode = resultNode;
		}
		else {
			if (l1.val + l2.val > 9)
			{
				addVal = 1;
				resultNode = new ListNode(l1.val + l2.val - 10);
				currentNode = resultNode;
			}
			else {
				addVal = 0;
				resultNode = new ListNode(l1.val + l2.val);
				currentNode = resultNode;
			}
			l1 = l1.next;
			l2 = l2.next;
		}

		while (notEmpty(l1, l2)) {
			addVal = addListNode(currentNode, l1.val + l2.val + addVal);
			currentNode = currentNode.next;
			l1 = l1.next;
			l2 = l2.next;
		}

		if (l1 == null && l2 == null) {
			if (addVal == 1) {
				currentNode.next = new ListNode(addVal);
			}
			return resultNode;
		}

		ListNode tailNode = l1 != null ? l1 : l2;
		currentNode.next = tailNode;

		while (tailNode != null) {
			addVal = addListNode(currentNode,addVal + tailNode.val);
			tailNode = tailNode.next;
			currentNode = currentNode.next;
		}
		if (addVal == 1) {
			currentNode.next = new ListNode(addVal);
		}
		return resultNode;
	}

	private boolean notEmpty(ListNode l1, ListNode l2) {
		return l1 != null && l2 != null;
	}

	private int addListNode(ListNode currentNode, int val) {
		int addVal = 0;
		if (val > 9) {
			addVal = 1;
			currentNode.next = new ListNode(val - 10);
		} else {
			currentNode.next = new ListNode(val);
		}
		return addVal;
	}
}
