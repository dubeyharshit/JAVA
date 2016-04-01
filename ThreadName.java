//import java.lang.Thread;

public class ThreadName {
public static void main(String[] args)
{
	Thread2 run = new Thread2();
	Thread t = new Thread(run);
	//t.setName("Fred");
	t.start();
	System.out.println(Thread.currentThread());
	
}		
}
class Thread2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			if(i%10==0)
			{
				System.out.println(i);
			}
			try{
			Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{ex.printStackTrace();}
		}	
	}
}