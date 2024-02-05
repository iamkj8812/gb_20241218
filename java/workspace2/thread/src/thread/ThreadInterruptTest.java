package thread;

public class ThreadInterruptTest extends Thread {
	public void run() {
		try
        {
            for (int i = 0 ; i < 10 ; i++)
            {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + i + "번째 수행");
            }
        }catch(InterruptedException e){    // 인터럽트 걸릴시 
        	e.printStackTrace();
            System.out.println("스레드 강제 종료");
            //쓰레드 함수 내에서 return 문을 통해서 종료 및 소멸시키는 방법이 가장 이상적
            return;	 
        }
	}
	
}
