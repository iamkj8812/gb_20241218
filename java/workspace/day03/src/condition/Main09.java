package condition;

public class Main09 {

	public static void main(String[] args) {
		// switch문 사용하여서
		// grade가 A 또는 B 또는 C이면 -> Pass 한번 출력
		// 그렇지 않은 등급이면 -> Not-Pass 한번 출력
		char grade = 'F';
		switch(grade) {
			case 'A':
			case 'B':
			case 'C':
				System.out.println("Pass");
				break;
			default:
				System.out.println("Not-Pass");
				break;
		}
		
		
		
	}

}





