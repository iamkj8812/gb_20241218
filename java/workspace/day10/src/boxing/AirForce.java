package boxing;

public class AirForce extends Unit{
	
	public AirForce(String name) {
		super(name);
	}
	
	public void attack() {
		super.attack();
		System.out.println(getName() + ">> 이륙");
		System.out.println(getName() + ">> 공중공격 실행");
	}
	public void bombing() {
		System.out.println(this.getName() + ">> 폭격");
	}
	
	// 1. Unit상속
	// 2. attack() override 
	//		-> 군대이름 출력 + >> 이륙
	//		-> 군대이름 출력 + >> 공중공격 실행
	// 3. bombing() 
	// 		-> 군대이름 출력 + >> 폭격
	
	
}
