
public class ThreadNew extends Thread {
	public static void main(String[] args)
	{
		ThreadNew n = new ThreadNew();
		Thread c = new Thread(n);
	    c.setName("Harshit");
	    c.start();		
	}
	public void run(){
		for(int i = 0;i<5;i++)
		{
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName());
	}
}
/*class ThreadD extends Thread
{
	

}
*/