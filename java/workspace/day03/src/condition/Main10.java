package condition;

public class Main10 {

	public static void main(String[] args) {
		/*
		 * 1. 1은 "축구", 2는 "농구", 3은 "야구",
		 * 4는 "배구, 그 외에는 "배드민턴"이 출력되도록 
		 * 프로그램을 만드시오  
		 */
		int num1 = 5;
		switch (num1) {
			case 1:
				System.out.println("축구");
				break;
			case 2:
				System.out.println("농구");
				break;
			case 3:
				System.out.println("야구");
				break;
			case 4:
				System.out.println("배구");
				break;
			default:
				System.out.println("배드민턴");
		}
		System.out.println("------------");		
		
		
		/*
		 * 2. 숫자가 3이면 "안녕"이 세줄, 
		 *    숫자가 2이면 "안녕"이 두줄,
		 *    숫자가 1일면 "안녕"이 한줄,
		 *    그 외에는 "잘가"를 출력
		 */
		int num2 = 5;
		switch(num2) {
			case 3:
				System.out.println("안녕");
			case 2:
				System.out.println("안녕");
			case 1:
				System.out.println("안녕");
				break;
			default:
				System.out.println("잘가");
				break;
		}
		
		
		
		
	}

}






