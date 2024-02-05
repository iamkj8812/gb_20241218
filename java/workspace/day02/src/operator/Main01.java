package operator;

public class Main01 {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 8;
		
		int resul1 = num1 + num2;
		int resul2 = num1 - num2;
		int resul3 = num1 * num2;
		int resul4 = num1 / num2;
		int resul5 = num1 % num2;
		
		// 12 + 8 = 결과값(resul1)
		System.out.println("12 + 8 = " + resul1);
		// 12 - 8 = 결과값(resul2)
		System.out.println("12 - 8 = " + resul2);
		// 12 * 8 = 결과값(resul3)
		System.out.println("12 * 8 = " + resul3);
		// 12 / 8 = 결과값(resul4)
		System.out.println("12 / 8 = " + resul4);
		// 12 % 8 = 결과값(resul5)
		System.out.println("12 % 8 = " + resul5);
		
		// 0으로 나누기
		int num = 100;
		int zero = 0;
		int result6 = num / zero;
		System.out.println("100 / 0 = " + result6);
		
		
		
	}

}







