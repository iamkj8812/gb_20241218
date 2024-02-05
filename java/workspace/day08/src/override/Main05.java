package override;

public class Main05 {

	public static void main(String[] args) {
		Army2 am = new Army2("육군");
		am.attack();
		am.tank();
		// Navy2, AirForce2 객체생성 및 기능 출력
		System.out.println("-------------");
		
		Navy2 nv = new Navy2("해군");
		nv.attack();
		nv.nucleus();
		System.out.println("-------------");
		
		AirForce2 af = new AirForce2("공군");
		af.attack();
		af.bombing();
	}

}








