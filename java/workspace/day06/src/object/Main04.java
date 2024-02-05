package object;

class Calc{
	int plus(int x, int y) {
		return x + y;
	}
	int minus(int x, int y) {
		return x - y;
	}
	int times(int x, int y) {
		return x * y;
	}
	int divide(int x, int y) {
		int result = 0;
		if(y != 0) {
			result = x / y;
		}
		return result;
	}
}

public class Main04 {

	public static void main(String[] args) {
		/*
		 * Calc 클래스 생성
		 *  - 4개의 메서드 정의
		 *  - plus(int,int), return int
		 *  - minus(int,int), return int
		 *  - times(int,int), return int
		 *  - divide(int,int), return int
		 *  - 결과값 각각 출력
		 *  // 3시 정각
		 */
		Calc c = new Calc();
		int p = c.plus(100, 50);
		System.out.println("100+50=" + p);
		System.out.println("100-50=" + c.minus(100, 50));
		System.out.println("100*50=" + c.times(100, 50));
		System.out.println("100/50=" + c.divide(100, 50));
		
		
	}

}







