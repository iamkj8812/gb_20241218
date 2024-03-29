package boxing;

public class Main03 {

	public static void main(String[] args) {
		// 부대지정
		Unit[] units = new Unit[5];
		
		units[0] = new AirForce("공군1호");
		units[1] = new AirForce("공군2호");
		units[2] = new Navy("해군1호");
		units[3] = new Army("육군1호");
		units[4] = new Army("육군2호");
		
		// 부대 일괄 공격
		// intanceof 사용해서 작성
		// units[i] 인스턴스를 Army, Navy, AirForce와 비교
		// Army면 tank(), Navy면 nucleus(),
		// AirForce면 bombing() 공격을 추가하자
		for(int i=0;i<units.length; i++) {
			units[i].attack();
			if( units[i] instanceof Army ) {
				Army a = (Army)units[i];
				a.tank();
			} else if( units[i] instanceof Navy ) {
				Navy n = (Navy)units[i];
				n.nucleus();
			} else {
				AirForce f = (AirForce) units[i];
				f.bombing();
			}
		}
	}
}
















