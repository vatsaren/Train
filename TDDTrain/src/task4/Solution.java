package task4;

public class Solution {


	public String longestCommonPrefix(String[] strs) {
		int minSizeWord = 200;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() < minSizeWord) {
				minSizeWord = strs[i].length();
			}
		}

		String res = "";
		Character nextChar = strs[0].charAt(0);
		int number = 0;
		for (int j = 0; j < minSizeWord; j++) {
			for (int i = 0; i < strs.length; i++) {
				if (strs[i].charAt(j) != nextChar) {
					return res;
				}
			}
			res += nextChar;
			if (j + 1 < minSizeWord) {
				nextChar = strs[0].charAt(j + 1);
			}
		}
		return res;
	}

}
