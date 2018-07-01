package StringAlgo;

/******
 * 
 * @author pratyusk
 *
 */
public class StringPermutation {
	public static void allPossibleSubString(String str) {
		System.out.println(str);
		for (int length = 1; length <= str.length(); length++) {
			for (int i = 0; i <= str.length() - length; i++) {
				System.out.println("substring of length " + length + ": " + str.substring(i, i + length));
			}
		}
	}

	public static String permute(String str, int beg, int end) {
		char ch[] = str.toCharArray();
		char c;
		if (beg != end) {
			c = ch[beg];
			ch[beg] = ch[end];
			ch[end] = c;
			System.out.println(String.valueOf(ch));
		}
		return String.valueOf(ch);

	}

	public static void allPermutationOfString(String string, int startIndex) {
		if (startIndex >= string.length())
			return;
		for (int fixedIndex = startIndex; fixedIndex < string.length(); fixedIndex++) {
			allPermutationOfString(permute(string, startIndex, fixedIndex), startIndex + 1);
		}
	}

	public static void allPermutationOfSubString(String str) {
		System.out.println(str);
		for (int length = 1; length <= str.length(); length++) {
			for (int i = 0; i <= str.length() - length; i++) {
				System.out.println("substring of length " + length + ": " + str.substring(i, i + length));
				System.out.println("=================All permutations===============");
				allPermutationOfString(str.substring(i, i + length), 0);
				System.out.println("================================================");
			}
		}
	}

	public static void main(String[] args) {
		String str = "abcd";
		// allPossibleSubString(str);
		allPermutationOfString(str, 0);
		// allPermutationOfSubString(str);
	}
}
