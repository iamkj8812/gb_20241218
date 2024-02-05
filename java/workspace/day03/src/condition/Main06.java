package condition;

public class Main06 {

	public static void main(String[] args) {
		/*
		 * 6. 서로 다른 특정 정수값 a,b,c의 
		 * (a=10, b=20, c=9)
		 * 최대값을 구하여라.
		 */
		int a=100, b=20, c=90;
		int max=0;
		
		if( a>b && a>c ) {
			max = a;
		} else {
			if( b > c ) {
				max = b;
			} else {
				max = c;
			}
		}
		System.out.println("최대값은 : " + max);
	}

}







