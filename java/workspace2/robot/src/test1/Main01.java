package test1;

public class Main01 {

	public static void main(String[] args) {
		// 4. DanceRobot, SingRobot, DrawRobot 객체 생성
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};

		for(int i=0; i< arr.length;i++) {
			// 5. 반복문을 통해서 action() 메서드 호출
			action(arr[i]);
		}

	}
	
	public static void action(Robot r) {
		// 6. 파라미터로 넘어온 객체 r이 DanceRobot인지 체크  
		if(r instanceof DanceRobot) {
			// 7. r 객체를 DanceRobot 으로 명시적 객체 형변환한다.
			DanceRobot dr = (DanceRobot)r;
			// 8. dance() 호출
			dr.dance();
		// 9. 파라미터로 넘어온 객체 r이 SingRobot인지 체크
		} else if(r instanceof SingRobot) {
			// 10. r 객체를 DanceRobot 으로 명시적 객체 형변환한다.
			SingRobot sr = (SingRobot)r;
			// 11. sing() 호출
			sr.sing();
		// 12. 파라미터로 넘어온 객체 r이 DrawRobot인지 체크
		} else if(r instanceof DrawRobot) {
			// 13. r 객체를 DanceRobot 으로 명시적 객체 형변환한다.
			DrawRobot dr = (DrawRobot)r;
			// 14. draw() 호출
			dr.draw();
		}
	}


}
