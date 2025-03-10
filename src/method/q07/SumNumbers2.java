package method.q07;

public class SumNumbers2 {
	public static void main(String[] args) {
		int i = 5;
		double j = 3.3;
		calculateSum(i, j);

	}

	public static int calculateSum(int i, double j) {
		System.out.println("第一引数(整数)：" + i);
		System.out.println("第二引数(実数)：" + j);
		int addAns = (int) (i + j);
		System.out.println("加算結果：" + addAns);
		return (int) addAns;

	}
}