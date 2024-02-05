package Extends;

public class Main01 {

	public static void main(String[] args) {
		/*
		 * - Article class 생성
		 * - QNAArticle class 생성
		 * - FileArticle class 생성
		 * - 각각의 관계 설정
		 * - main()에서 QNAArticle 객체생성 후 값 세팅,출력(toString 활용)
		 * - FileArticle 객체생성 후 값 세팅,출력(toString 활용)
		 * ~10시 25분
		 */
		QNAArticle qna = new QNAArticle();
		qna.setNum(1);
		qna.setTitle("첫 번째 질문입니다.");
		qna.setAnswer("첫 번째 답변입니다.");
		System.out.println(qna.toString());
		System.out.println("------------");
		
		FileArticle file = new FileArticle();
		file.setNum(1);
		file.setTitle("첫 번째 자료");
		file.setFileName("day08.zip");
		System.out.println(file.toString());
		
	}

}









