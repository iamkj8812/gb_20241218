package thread;

public class Main04 {

	public static void main(String[] args) {
        Bank t1 = new Bank("ATM");
        Bank t2 = new Bank("은행");
        
        t1.start();
        t2.start();
	}

}
