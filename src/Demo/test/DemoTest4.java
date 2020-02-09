package Demo.test;

public class DemoTest4 {
public static void main(String[] args) {
	Numbers();
}
public static void Numbers() {
	for (int i = 10000; i < 100000; i++) {
		int wan=i/10000%10;
		int qian = i/1000%10;
		
		int shi = i/10%10;
		int ge=i%10;
		
		if(wan==ge &&qian==shi)
		{
			System.out.println(i);
		}
	}
}
}
