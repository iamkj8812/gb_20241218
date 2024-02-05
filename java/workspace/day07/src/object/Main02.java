package object;

class Book{
	String subject;
	String content;
	// 생성자 -> 객체가 생성될때, 자동으로 실행되는 특수한 메서드
	// 리턴형 명시하지 않고, 클래스와 이름이 동일
	Book(){
		System.out.println("==생성자 실행됨==");
		this.subject = "자바입문";
		this.content = "자바는 객체지향 언어이다.";
	}
	void read() {
		System.out.println("--read() 생성됨--");
		System.out.println(this.subject);
		System.out.println(this.content);
	}
}
public class Main02 {

	public static void main(String[] args) {
		Book book = new Book();
		book.read();
//		System.out.println(book.content);
//		System.out.println(book.subject);
		
	}

}













