package object;

class User2{
	public String name = "자바학생";
	private int age = 20;
}

public class Main05 {

	public static void main(String[] args) {
		User2 u = new User2();
		// public 이므로 접근 가능
		System.out.println(u.name);
		// private 이므로 접근 불가능
		// System.out.println(u.age);
		
	}

}














