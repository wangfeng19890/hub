package Demo.test;

import java.util.Scanner;

public class SumTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("input the first int");
		int a = sc.nextInt();
		System.out.println("input the second int");
		int b = sc.nextInt();

		int result = Sum(a, b);
		System.out.println("result: " + result);

		System.out.println("input a string");
		String c = sc.next();
		System.out.println(c);

		sc.close();
	}

	public static int Sum(int a, int b) {
		return a + b;
	}
}
