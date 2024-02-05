package Extends;

public class QNAArticle extends Article{
	private String answer;	// 답변

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "질문/답변 게시판 [ 글번호=" + getNum()
				+ ", 글제목=" + getTitle()
				+ ", 답변=" + answer + "]";
	}
	
	
}






