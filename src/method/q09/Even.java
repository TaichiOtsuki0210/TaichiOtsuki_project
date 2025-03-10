package method.q09;

public class Even {
	public static void main(String[] args) {
		checkEven(8);

	}

	public static String checkEven(int a) {

		String result = null;

		if (a % 2 == 0) {
			System.out.println(a + "は偶数です。");
			result = "true";
		} else {
			System.out.println(a + "は奇数です。");
			result = "false";

		}
		return result;
	}
}