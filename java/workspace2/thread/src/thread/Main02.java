package thread;

public class Main02 {

	public static void main(String[] args) {
		// Runnable 인터페이스 객체생성
//		RunableTest ru1 = new RunableTest();
		// Runnable 객체를 매개변수로 하여 스레드 객체 생성
//		Thread th1 = new Thread(ru1);
		
		// Runnable 인터페이스 객체생성과 객체를 매개변수로 하여 스레드 객체 한번에 생성
		Thread th1 = new Thread(new RunableTest());
		Thread th2 = new Thread(new RunableTest());
		Thread th3 = new Thread(new RunableTest());
		
		//1. 동시에 똑같은 숫자가 나오고(start
//		th1.start();
//		th2.start();
//		th3.start();
		
		// 2. 번갈아가면서 나옴(run)
		th1.run();
		th2.run();
//		th3.run();
	}

}

