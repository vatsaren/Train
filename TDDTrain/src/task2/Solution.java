package task2;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public boolean isPalindrome(int x) {
		List<Integer> revLst = new ArrayList<>();
		while (x > 0) {
			revLst.add(x%10);
			x /= 10;
		}
		int end = revLst.size() - 1;
		int start = 0;
		while (start < end) {
			if (revLst.get(start) != revLst.get(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
