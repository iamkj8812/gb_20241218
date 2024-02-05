package override;

public class Main04 {

	public static void main(String[] args) {
		Army am = new Army();
		am.setName("육군");
		am.attack();
		am.tank();
		System.out.println("-----------");
		
		Navy nv = new Navy();
		nv.setName("해군");
		nv.attack();
		nv.nucleus();
		System.out.println("-----------");
		
		AirForce af = new AirForce();
		af.setName("공군");
		af.attack();
		af.bombing();
		
		
	}

}







