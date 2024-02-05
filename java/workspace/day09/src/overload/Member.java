package overload;

public class Member {
	private String job;
	private int age;
	
	// 기본생성자
	public Member() {}
	// 생성자 int parma1, this.age 할당
	public Member(int age) {
		this.age = age;
	}
	// 생성자 String parma1, this.job 할당
	public Member(String job) {
		this.job = job;
	}
	// 생성자 String param1, int param2,
	// this.job, this.age 각각 할당 
	public Member(String job, int age) {
		this.job = job;
		this.age = age;
	}
	// toString()
	@Override
	public String toString() {
		return "Member [job=" + job 
				+ ", age=" + age + "]";
	}
	
}





