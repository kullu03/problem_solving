import java.util.HashSet;
import java.util.Set;

public class UniqueDigitNum {

	public static void main(String[] args) {

		Set<Integer> result = getUniqueDigitNum(1, 1234567897);
		System.out.println(result);
	}

	private static Set<Integer> getUniqueDigitNum(int num1, int num2) {
		Set<Integer> result = new HashSet<Integer>();
		Set<Integer> tempSet = new HashSet<Integer>();
		for (int i = num1; i <= num2; i++) {
			int rr = i;
			int c = 0;
			/*while (rr > 0) {
				int r = rr % 10;
				rr = rr / 10;
				c = c + 1;
				tempSet.add(r);
			}*/
			if (tempSet.size() == c) {
				result.add(i);
			}
			tempSet.clear();
		}

		return result;

	}
}
