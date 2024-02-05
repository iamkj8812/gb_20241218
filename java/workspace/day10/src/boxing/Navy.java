package boxing;

public class Navy extends Unit{
	
	public Navy(String name) {
		super(name);
	}
	
	public void attack() {
		super.attack();
		System.out.println(this.getName() + ">> 어뢰발사!");
		System.out.println(this.getName() + ">> 지상상륙");
	}
	public void nucleus() {
		System.out.println(this.getName() + ">> 핵미사일");
	}
	
	// 1. Unit상속
	// 2. attack() override 
	//		-> 군대이름 출력 + >> 어뢰 발사!!
	//		-> 군대이름 출력 + >> 지상 상륙
	// 3. nucleus() 
	// 		-> 군대이름 출력 + >> 핵미사일
}
