package method;

public class Main04 {
	public static double calculate(double num1, 
							double num2, char op) {
		double result = 0.0;
		switch(op) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				if(num2 != 0) {
					result = num1 / num2;
				}else {
					System.out.println("0으로 나눌수 없습니다.");
				}
				break;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("계산 결과: " 
						+ calculate(5, 0, '/'));
	}

}







