package task4;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

	@Test
	public void runTest() {
		Solution testClass = new Solution();
		String[] s1 = {"царь", "царство", "царевич"};
		assertEquals("цар", testClass.longestCommonPrefix(s1));

		String[] s2 = {"горька", "горыныч", "гора", "горевать", "горе", "гуру"};
		assertEquals("г", testClass.longestCommonPrefix(s2));

		String[] s3 = {"ключ", "ключница", "ключевой", "ключи"};
		assertEquals("ключ", testClass.longestCommonPrefix(s3));

		String[] s4 = {"карапуз", "картон", "герой", "кукушка"};
		assertEquals("", testClass.longestCommonPrefix(s4));
	}
}