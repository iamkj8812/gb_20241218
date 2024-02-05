package object;

class Article{
	int seq;		// 글 번호
	String subject;	// 글 제목
	String writer;	// 작성자
	
	Article(int seq, 
			String subject, String writer) {
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	void print() {
		System.out.println(this.seq);
		System.out.println(this.subject);
		System.out.println(this.writer);
	}
}

public class Main04 {

	public static void main(String[] args) {
		/**
		 * Article 클래스 생성
		 *  - 필드, seq(글번호),subject(글제목),writer(작성자) 
		 *  - 객체 생성시 int, String, String 필수
		 *  - print() 메서드 생성해서, 글번호,글제목,작성자를 각각 출력
		 *  
		 *  - main()에서, Article 객체 생성 후 print() 출력
		 */
		Article article1 = new Article(1, 
								"자바 첫 게시글", "자바학생");
		article1.print();
		
		Article article2 = new Article(2, 
						"자바 게시글 두번째", "자바강사");
		article2.print();
		
	}

}
















