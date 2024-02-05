package loop;

public class Main01 {

	public static void main(String[] args) {
		/*
		 * 구구단 출력 	: 결과 값
		 * 			  2단 ~ 9단 
		 */
		for( int i=2; i<=9; i++ ) {	// 단
			for(int j=1; j<10; j++) {
				int k = i * j;
				System.out.println(k);
			}
			
			if(i<9) {
				System.out.println("-----------");
			}
		}
	}

}







