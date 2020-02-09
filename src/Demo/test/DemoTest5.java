package Demo.test;

public class DemoTest5 {
	public static void main(String[] args) {
		int[] arr = new int[20];
		for (int i = 0; i < 20; i++) {
			if (i == 0 || i == 1) {
				arr[i] = 1;
			} else {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
		}

		System.out.println(arr[19]);
	}
}
