package Chapter4;

public class SecondHalfLetters {
	private static int secondHalfLetters(String s) {
		s = s.toLowerCase();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) > 109) {
				count++;
			}
		}
		return count;
	}
}
