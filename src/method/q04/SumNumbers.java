package method.q04;

public class SumNumbers {
	public static void main(String[] args) {
		int i = 3;
		int j = 2;
		calculateSum(i, j);

	}

	public static int calculateSum(int i, int j) {
		System.out.println("第一引数：" + i);
		System.out.println("第二引数：" + j);
		int addAns = i + j;
		System.out.println("加算結果：" + addAns);
		return addAns;
	}
}