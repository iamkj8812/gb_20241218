package thread;

public class ThreadTest extends Thread {

	public void run(){
			try {
				for(int i=0; i<10; i++) {
					Thread.sleep(2000);
					System.out.println("Thread È£Ãâ " + i);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    }
}
