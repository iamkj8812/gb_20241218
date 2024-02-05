package operator;

public class Main06 {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int x = 5;
		int y = 3;
		
		// T || F -> T
		boolean result1 = a != b || a == b;
		System.out.println(result1);
		// T || T -> T
		boolean result2 = a < b || x > y;
		System.out.println(result2);
		boolean result3 = a < b || x < y;
		System.out.println(result3);
		boolean result4 = a > b || x > y;
		System.out.println(result4);
		boolean result5 = a > b || x < y;
		System.out.println(result5);
		System.out.println("-----------------");
		
		boolean r1 = a >= b;	// f
		boolean r2 = x >= y;	// t
		boolean result6 = r1 && r2;
		boolean result7 = r1 || r2;
		System.out.println(result6);
		System.out.println(result7);
		System.out.println("--------------------");
		
		boolean success = true;
		boolean fail = !success;
		System.out.println(fail);
		
	}

}






