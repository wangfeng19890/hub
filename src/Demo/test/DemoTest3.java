package Demo.test;

public class DemoTest3 {
	public static void main(String[] args) {
		Man man1 = new Man();
		man1.name = "1";

		Man man2 = new Man();
		man2.name = "2";
		
		Man man3 = man1;
		System.out.println("man1 == man2:"+ (man1 == man2));
		System.out.println("man1.equals(man2):"+(man1.equals(man2)));
		
		System.out.println("man1 == man3:"+ (man1==man3));
		System.out.println("man1.equals(man3):"+(man1.equals(man3)));

		int a = 1;
		int b = 1;
		System.out.println(a == b);
		int c = Integer.compare(a, b);
		System.out.println(c);
	}
}
