package task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

	@Test
	public void runTest() {
		Solution testClass = new Solution();

		assertTrue(testClass.isPalindrome(121));
		assertTrue(testClass.isPalindrome(121121));
		assertTrue(testClass.isPalindrome(12211221));
		assertTrue(testClass.isPalindrome(43134));
		assertTrue(testClass.isPalindrome(43134));

		assertFalse(testClass.isPalindrome(123));
		assertFalse(testClass.isPalindrome(3222));
		assertFalse(testClass.isPalindrome(228));
		assertFalse(testClass.isPalindrome(1488));
	}
}