import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

	@Test
	public void addTwoNumbers() {
		ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(3)));
		ListNode node2 = new ListNode(3, new ListNode(2, new ListNode(1)));
		ListNode node3 = new ListNode(3, new ListNode(2, new ListNode(1, new ListNode(4))));
		ListNode node1Copy = new ListNode(1, new ListNode(2, new ListNode(3)));
		//тесты сравнения
		assertTrue(ListNode.equals(node1, node1Copy));
		assertFalse(ListNode.equals(node1, node2));
		assertFalse(ListNode.equals(node1, node3));

		//тесты суммирования
		Solution solution = new Solution();
		ListNode node1AddNode2 = new ListNode(4, new ListNode(4, new ListNode(4)));
		assertTrue(ListNode.equals(node1AddNode2, solution.addTwoNumbers(node1, node2)));

		ListNode node1AddNode3 = new ListNode(4, new ListNode(4, new ListNode(4, new ListNode(4))));
		assertTrue(ListNode.equals(node1AddNode3, solution.addTwoNumbers(node1, node3)));

		ListNode node4 = new ListNode(9, new ListNode(8, new ListNode(3, new ListNode(4))));
		ListNode node1AddNode4 = new ListNode(1, new ListNode(0, new ListNode(8, new ListNode(7, new ListNode(4)))));
		assertTrue(ListNode.equals(node1AddNode4, solution.addTwoNumbers(node1, node4)));

		ListNode node5 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
		ListNode node6 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
		ListNode node5AddNode6 = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));
		assertTrue(ListNode.equals(node5AddNode6, solution.addTwoNumbers(node5, node6)));








	}
}