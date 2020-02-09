package Demo.test;

public class DebugTest1 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		Sumint(a, b);
		System.out.println(a);
		System.out.println(b);
	}

	public static void Sumint(int a, int b) {
		a= a+1;
		b= b +1;
	}
}
