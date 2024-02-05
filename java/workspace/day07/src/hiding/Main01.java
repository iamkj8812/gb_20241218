package hiding;

public class Main01 {

	public static void main(String[] args) {
		/**
		 * 4.main()에서 객체 생성 후, name과 age를 출력
		 */
		Member s = new Member("자바학생", 20);
		System.out.println("이름 : " + s.getName());
		System.out.println("나이 : " + s.getAge());
		
		s.setName("김자바");
		System.out.println(s.getName());
		
	}

}






