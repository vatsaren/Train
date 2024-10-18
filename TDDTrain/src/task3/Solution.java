package task3;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	private Map<Character, Integer> base;

	public Solution() {
		base = new HashMap<>();
		base.put('I',1);
		base.put('V',5);
		base.put('X',10);
		base.put('L',50);
		base.put('C',100);
		base.put('D',500);
		base.put('M',1000);
	}


	public int romanToInt(String s) {
		char[] charArray = s.toCharArray();
		int size = charArray.length;
		if (size == 1) {
			return base.get(charArray[0]);
		}
		int result = 0;
		int currValue = 0;
		int nextValue = 0;
		int i = 0;
		for (; i < size - 1; i++) {

			currValue = base.get(charArray[i]);
			nextValue = base.get(charArray[i + 1]);
			if(currValue < nextValue) {
				result += nextValue - currValue;
				i++;
			} else {
				result += currValue;
			}
		}
		if (i != size) {
			result += base.get(charArray[size - 1]);
		}
		return result;
	}
}
