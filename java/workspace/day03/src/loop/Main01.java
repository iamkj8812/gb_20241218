package loop;

public class Main01 {

	public static void main(String[] args) {
		int sum = 0;	// 결과 값
		// 1~100까지의 누적된 합
		for(int i=1;i<=100;i++) {
			// 누적된 결과 값
			sum += i;
			System.out.println("i : " + i);
			System.out.println("sum : " + sum);
		}
		System.out.println(sum);
	}

}






