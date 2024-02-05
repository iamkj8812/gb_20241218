package array;

public class Main01 {

	public static void main(String[] args) {
		/*
		 * 배열의 생성
		 */
		// 배열의 선언과 크기 지정 및 값의 할당에 대한 개별 처리
		int[] dooly;
		dooly = new int[3];
		dooly[0] = 75;
		dooly[1] = 82;
		dooly[2] = 91;
		
		// 배열의 선언과 크기 지정의 일괄처리
		int[] douneo = new int[3];
		douneo[0] = 88;
		douneo[1] = 64;
		douneo[2] = 50;
		
		// 배열의 생성의 일괄처리
		int[] ddocy = new int[] {100,100,90};
		
		/*
		 * 배열의 활용
		 */
		int sum1 = 0, sum2 = 0, sum3 = 0;
		// sum1 : 둘리의 총합, 문 : 둘리의 총합,평균 각 출력
		// sum2 : 도우너의 총합,문 : 도우너의 총합,평균 각 출력
		// sum3 : 또치의 총합, 문 : 또치의 총합,평균 각 출력
		
		// 합계
		for(int i=0; i<dooly.length; i++) {
			sum1 += dooly[i];
		}
		for(int i=0; i<douneo.length; i++) {
			sum2 += douneo[i];
		}
		for(int i=0; i<ddocy.length; i++) {
			sum3 += ddocy[i];
		}
		
		System.out.println("둘리의 총합 : " + sum1 
			+ ", 둘리의 평균 : " + sum1/dooly.length);
		System.out.println("도우너의 총합 : " + sum2 
				+ ", 도우너의 평균 : " + sum2/douneo.length);
		System.out.println("또치의 총합 : " + sum3 
				+ ", 또치의 평균 : " + sum3/ddocy.length);
	}

}
























