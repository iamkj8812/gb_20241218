package override;

public class Army extends Unit {
//	Army(){
//		super();
//	}
	
	// override
	@Override
	public void attack() {
		super.attack();
		System.out.println( super.getName() + ">> 지상공격");
	}
	public void tank() {
		System.out.println(super.getName() + ">> 탱크공격");
	}
}








