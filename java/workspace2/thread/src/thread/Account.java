package thread;

public class Account {

    int balance = 1000;
 
    public void withdraw(int money)
    {
        if(balance >= money)
        {
            try{
                Thread.sleep(000);
            }catch(Exception e) { 
            	e.printStackTrace();
            }
            balance -= money;
        }
    }
}
