package Demo.test;

import java.util.Scanner;

public class DemoTest1 {
	public static void main(String[] args) {
		System.out.println("input the month");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch (month) {
		case 1:
		case 2:
		case 3:
			System.out.println("chun");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("xia");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("qiu");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("dong");
			break;
		default:
			System.out.println(month);
			break;
		}
		
		scanner.close();
	}
}
