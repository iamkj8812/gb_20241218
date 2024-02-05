package overload;

public class Main03 {

	public static void main(String[] args) {
		// 총 4개의 서로다른 생성자로 객체 생성
		// 각각을 toString() 출력
		Member m1 = new Member();
		System.out.println(m1.toString());
		
		Member m2 = new Member(10);
		System.out.println(m2.toString());
		
		Member m3 = new Member("강사");
		System.out.println(m3.toString());
		
		Member m4 = new Member("학생", 30);
		System.out.println(m4.toString());
	}

}






