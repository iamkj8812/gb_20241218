package le_go;

import java.util.Scanner;

public class mk1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("계산기를 시작합니다. 연산을 입력하세요 (예: 2 + 2):");

        double num1 = scanner.nextDouble();
        String operator = scanner.next();
        double num2 = scanner.nextDouble();

        switch (operator) {
            case "+":
                System.out.println("결과: " + (num1 + num2));
                break;
            case "-":
                System.out.println("결과: " + (num1 - num2));
                break;
            case "*":
                System.out.println("결과: " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    System.out.println("결과: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("유효하지 않은 연산자입니다.");
        }

        scanner.close();
    }
}