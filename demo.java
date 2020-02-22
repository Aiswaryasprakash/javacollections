package bank;






class unableException extends RuntimeException {

	String message;
	
	unableException(){
	
	}
	
	public unableException(String message) {
	
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
	}
class customer{
	int amount=0;
	int flag=0;
	
	
	public synchronized int withdraw(int amount) throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+"going to withdraw");
		if(flag==0)
		{
			System.out.println("no balance...waiting");
		wait();
		}
		
	
	if(amount>this.amount){
		throw new unableException("no balance");
		
	
	}
	System.out.println("withdraw started");
		this.amount-=amount;
		System.out.println("withdraw completed");
		return amount;
		
	}
	public synchronized void deposit(int amount){
		System.out.println(Thread.currentThread().getName()+"is going to deposit");
		this.amount+=amount;
		System.out.println("after deposit is "+amount);
		notifyAll();
		flag=1;
	}
}

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final customer c=new customer();
Thread t1=new Thread()
{
	public void run(){
		c.deposit(9000);
		
	}
};
Thread t2=new Thread()
{
	public void run(){
		try {
			c.withdraw(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("bal"+c.amount);
	}
};

t2.start();
t1.start();
}
	}

