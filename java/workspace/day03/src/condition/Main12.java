package condition;

public class Main12 {

	public static void main(String[] args) {
		/*
		 * 1. 정수 a가 10보다 작거나 같으면 100을 곱하고,
		 * 그렇지 않으면 a값을 출력
		 */
		int a = 15;
		int result = a <= 10 ? a * 100 : a;
		System.out.println(result);
		
		/*
		 * 2. 현재시각 hour 변수가 12시보다 작으면 
		 * '오전', 그렇지 않으면 '오후' 출력
		 */
		int hour = 15;
		String ampm = hour < 12 ? "오전" : "오후";
		System.out.println(ampm);
	}

}







