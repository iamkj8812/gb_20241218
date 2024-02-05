package thread;

public class Bank extends Thread {
	static Account obj = new Account();
    public Bank(String name) { super(name); }
    
    public void run()
    {
        while(true)
        {
            // 그 함수가 포함된 해당 객체(this)에 lock을 거는것과 같다
            synchronized(obj) {
                int money = (int)(Math.random() * 3 + 1) *100;		//100, 200, 300원 금액 중 하나
                if(obj.balance >= money){
                    System.out.println(getName() + " - 원금의 balance : " + obj.balance);
                    System.out.println(getName() + " - 찾는 금액 : " + money);
                    obj.withdraw(money);
                    System.out.println(getName() + " - 수정된 balance : " + obj.balance);
                }else{
                    System.out.println("잔액 부족");
                    break;
                }
            }
        }
    }
}
