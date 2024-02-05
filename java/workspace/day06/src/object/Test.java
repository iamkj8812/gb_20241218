package object;

class Student2{
	String name;
	public void setName(){
		String name;
		name = "자바학생";
		this.name = "홍길동";
	}
}
public class Test {
	public static void main(String[] args) {
		Student2 s = new Student2();
		s.setName();
		System.out.println(s.name);
	}

}





