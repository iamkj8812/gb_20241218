package object;

class Student{
	// 멤버변수
	String name = "자바학생";
	int age = 20;
}
public class Main01 {
	public static void main(String[] args) {
		// 객체의 선언과 할당의 분리
		Student std;			// 객체생성
		std = new Student();	// 객체할당
		
		// 객체의 선언과 할당 일괄지정
		Student std2 = new Student();
		
		System.out.println("std.name : " + std.name);
		System.out.println("std.age : " + std.age);
		
		System.out.println("std2.name : " + std2.name);
		System.out.println("std2.age : " + std2.age);
		System.out.println("-----------------------");
		
		std.name = "이순신";
		std.age = 100;
		
		std2.name = "홍길동";
		std2.age = 1000;
		
		System.out.println("std.name : " + std.name);
		System.out.println("std.age : " + std.age);
		
		System.out.println("std2.name : " + std2.name);
		System.out.println("std2.age : " + std2.age);
		System.out.println("-----------------------");
		
		
	}

}






