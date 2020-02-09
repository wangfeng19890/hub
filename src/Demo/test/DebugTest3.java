package Demo.test;

public class DebugTest3 {

	public static void main(String[] args) {
		Man man= new Man();
		man.name="test1";
		updateName(man);
		System.out.println(man.name);
	}
	
	public static void updateName(Man man) {
		man.name="haha";
	}
}