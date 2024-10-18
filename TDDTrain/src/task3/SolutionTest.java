package task3;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SolutionTest {

	@Test
	public void runTest() {
		Map<String, Integer> testCases = new HashMap<>();
		testCases.put("I", 1);
		testCases.put("V", 5);
		testCases.put("X", 10);
		testCases.put("L", 50);
		testCases.put("C", 100);
		testCases.put("D", 500);
		testCases.put("M", 1000);
		testCases.put("VI", 6);
		testCases.put("IX", 9);
		testCases.put("XVII", 17);
		testCases.put("MDCLXVII", 1667);
		testCases.put("CMX", 910);
		testCases.put("CLV", 155);
		testCases.put("MCMXCIV", 1994);

		Solution testCLass = new Solution();
		for (Map.Entry<String, Integer> entry : testCases.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			assertEquals(value.intValue(), testCLass.romanToInt(key));
		}
	}
}