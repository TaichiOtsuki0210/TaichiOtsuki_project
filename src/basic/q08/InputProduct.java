package basic.q08;

import java.util.Scanner;

public class InputProduct {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("商品名を入力してください：");
		String product = scanner.next();

		System.out.println("価格を入力してください:");
		String price = scanner.next();

		System.out.println("商品名は" + product + "です。価格は" + price + "円です。");
	}
}