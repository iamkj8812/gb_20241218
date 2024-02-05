package object;

class Character{
	// 멤버변수만 선언
	String name;
	int age;
	String job;
}

public class Main02 {

	public static void main(String[] args) {
		// character 클래스를 가지고 객체2개 생성 후,
		// 각 객체별 name,age,job을 할당 후 출력
		Character ch1 = new Character();
		ch1.name = "둘리";
		ch1.age = 19;
		ch1.job = "공룡";
		
		Character ch2 = new Character();
		ch2.name = "김자바";
		ch2.age = 20;
		ch2.job = "학생";
		
		System.out.println("이름 : " + ch1.name 
					+ " 나이 : " + ch1.age 
					+ " 직업 : " + ch1.job);

		System.out.println("이름 : " + ch2.name 
					+ " 나이 : " + ch2.age 
					+ " 직업 : " + ch2.job);
	}

}








