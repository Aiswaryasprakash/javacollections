package multithreading;



public class testthread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<=15;i++)
		{
		if(i%2==0)
		{
			System.out.println("even"+i);
		}
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
			}
			
	
	}
		}
	
	
	
	