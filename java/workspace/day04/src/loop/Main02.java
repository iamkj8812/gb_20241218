package loop;

public class Main02 {

	public static void main(String[] args) {
		// 1~10까지의 누적된 합
		int sum = 0;
		int i = 1; // 초기값 
		
		while(i <= 10) {
			sum += i;
			i++;	// 증감식
		}
		System.out.println(sum);
		
	}

}







