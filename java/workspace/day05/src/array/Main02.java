package array;

public class Main02 {

	public static void main(String[] args) {
		/*
		 * 1.22,3,8,12 를 배열안에 선언하고
		 * 	 합계를 구하여라
		 */
		int[] num1 = new int[]{22,3,8,12};
		int sum1 = 0;
		
		for(int i=0; i<num1.length; i++) {
			sum1 += num1[i];
		}
		System.out.println("합계 : " + sum1);
		System.out.println("------------");
		
		/*
		 * 2. 60,90,88를 배열로 만들어서
		 * 	  합계와 평균을 각각 구하여라
		 */
		int num2[] = new int[]{60,90,88};
		int sum2 = 0;
		for( int i=0; i<num2.length; i++ ) {
			sum2 += num2[i];
		}
		System.out.println("합계 : " + sum2);
		System.out.println("평균 : " 
					+ sum2/num2.length);
		System.out.println("---------");
		
		/*
		 * 3. 94, 85, 95, 88, 90를 배열로
		 * 	  선언해서 이 중에서 최대값을 출력하여라.
		 */
		int[] num3 = {94, 85, 95, 88, 190, 100};
		int max = num3[0];
		for(int i=1; i<num3.length; i++) {
			if(max < num3[i]) {
				max = num3[i];
			}
		}
		System.out.println("최대값 : " + max);
		
		/*
		 * 4. 22, 3, 8, 12를 배열로 선언해서
		 * 	  짝수와 홀수의 합을 각각 구하여라
		 */
		int[] num4 = {22, 3, 8, 12};
		int even = 0; 	// 짝수
		int odd = 0;	// 홀수
		
		for(int i=0; i<num4.length; i++) {
			if( num4[i]%2 == 0 ) { 	// 짝수
				even += num4[i];
			}else {					// 홀수
				odd += num4[i];
			}
		}
		System.out.println("짝수 : " + even);
		System.out.println("홀수 : " + odd);
		
	}

}




