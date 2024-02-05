package condition;

public class Main05 {

	public static void main(String[] args) {
		/*
		 * 1. 만약 3000원 이상의 돈을 가지고 있으면 
		 * '택시를 타고 가라', 
		 * 그렇지 않으면 '걸어가라'
		 */
		int money = 5000;
		if( money >= 3000 ) {
			System.out.println("택시를 타고가라");
		} else {
			System.out.println("걸어가라");
		}
		System.out.println("--------------");
		
		/*
		 * 2. 돈이 3000원 이상 있거나, 카드가 있다면 
		 * '택시를 타고 가라'
		 * 그렇지 않다면 '걸어가라'
		 */
		int money2 = 2000;
		boolean hasCard = false;	// true: 카드있음.
		if( money2 >= 3000 || hasCard ) {
			System.out.println("택시를 타고가라");
		} else {
			System.out.println("걸어가라");
		}
		System.out.println("------------");
		
		if( hasCard ) {
			System.out.println("택시를 타고가라");
		} else if(money2 >= 3000 ) {
			System.out.println("택시를 타고가라");
		} else {
			System.out.println("걸어가라");
		}
		
		System.out.println("------------");
		if( money2 >= 3000) {
			System.out.println("택시를 타고가라");
		} else {
			if(hasCard) {
				System.out.println("택시를 타고가라");
			}else {
				System.out.println("걸어가라");
			}
		}
		System.out.println("===============");
		/*
		 * 3. 어떤 특정 정수 값 a가 짝수이면 "짝수",
		 * 홀수이면 "홀수" 
		 */
		int a = 9;
		if( a % 2 == 0 ) {	// true
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		System.out.println("===============");
		
		/*
		 * 4. 국어, 영어, 수학 점수의 평균이 95점 이상이면
		 * '장학생'을 출력,
		 * 국어점수가 70점 이상이면 "국어 : 합격",
		 * 그렇지 않으면 "국어 : 불합격"
		 */
		int kor = 60, eng = 100, mat = 95;
		int avg = (kor+eng+mat) / 3;
		if(avg >= 95) {
			System.out.println("장학생");
		}
		
		if( kor >= 70 ) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		System.out.println("===============");
		
		
		/*
		 * 5. 수학점수가 90점 이상이면 "A"학점, 
		 * 80점 이상이면 "B"학점, 70점 이상이면 "C"학점,
		 * 60점 이상이면 "D"학점, 나머지 "F"학점
		 */
		int mat2 = 57;
		if( mat2 >= 90 ) {
			System.out.println("A학점");
		} else if (mat2 >= 80 ) {
			System.out.println("B학점");
		} else if (mat2 >= 70 ) {
			System.out.println("C학점");
		} else if (mat2 >= 60 ) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		
	}

}





