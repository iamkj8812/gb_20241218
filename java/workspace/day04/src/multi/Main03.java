package multi;

public class Main03 {

	public static void main(String[] args) {
		/*
		 * 1. 1~10까지의 숫자의 합은?
		 */
		int sum = 0;
		for( int i=1; i<=10; i++ ) {
			sum += i;
		}
		System.out.println("1~10사이의 합 : " + sum);
		System.out.println("--------------");
		
		/*
		 * 2. 1~10까지의 홀수의 합
		 */
		int sum2 = 0;
		for( int i=1; i<=10; i++ ) {
			if(i%2==1) {	// 홀수
				sum2 += i;
			}
		}
		System.out.println("1~10사이의 홀수의 합 : " + sum2);
		System.out.println("--------------");
		
		/*
		 * 3. 1~10까지의 짝수의 합
		 */
		int sum3 = 0;
		for( int i=1; i<=10; i++ ) {
			if(i%2==0) {	// 짝수
				sum3 += i;
			}
		}
		System.out.println("1~10사이의 짝수의 합 : " + sum3);
		System.out.println("--------------");
		/*
		 * 4. 구구단 2단. 
		 * 화면 :	2 * 1 = 2
		 * 		2 * 2 = 4
		 * 		...
		 * 		2 * 9 = 18
		 */
		int j = 2;
		for( int i=1; i<10; i++ ) {
			System.out.println(j+"*"+i+"="+(j*i));
		}
		
		/*
		 * 5. whil문으로 작성
		 * "10번찍어 안넘어가는 나무 없다."
		 * 결과 : 	나무를 1번 찍었습니다.
		 *  		나무를 2번 찍었습니다.
		 *  		...
		 *  	 	나무를 10번 찍었습니다.
		 *  		나무가 넘어갑니다.
		 */
			
		int treeHit = 0;
		while(treeHit < 10) {
			treeHit++;
			System.out.println("나무를 "
					+ treeHit + "번 찍었습니다.");
			if( treeHit == 10 ) {
				System.out.println("나무 넘어갑니다.");
			}
		}
	}

}








