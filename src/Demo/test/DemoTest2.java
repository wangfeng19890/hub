package Demo.test;

import java.util.ArrayList;


public class DemoTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumbers();
	}

	public static void PrintNumbers() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 10000; i < 100000; i++) {
			String numberString = String.valueOf(i);
			String wanString = numberString.substring(0, 1);
			String qianString = numberString.substring(1, 2);

			String geString = numberString.substring(4);
			String shiString = numberString.substring(3, 4);

			if (wanString.equals(geString) && qianString.equals(shiString)) {
//			if (wanString == geString && qianString == shiString) {
				arrayList.add(i);
			}
		}

		System.out.println(arrayList.size());
	}

}
