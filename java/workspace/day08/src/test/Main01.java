package test;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력해주세요: ");
		int num1 = scan.nextInt();
		System.out.println("입력된 숫자는 " + num1);
		
		System.out.println("두 번째 숫자를 입력해주세요: ");
		int num2 = scan.nextInt();
		System.out.println("입력된 숫자는 " + num2);
		
		Calc c = new Calc("곽지현");
		System.out.println(c.getName());
		
		
		System.out.println(num1 + "+" + num2 + "="
							+ c.plus(num1, num2));
		
	}

}








