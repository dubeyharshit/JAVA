public class ExceptionThrow {	
public static void main (String[] args)
{
	try
	{
	int abc = 1;
	ExceptionThrow e = new ExceptionThrow();
         e.exce(abc);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void exce(int w) throws Exception
{
	if (w ==1)
	{
		throw new Exception("Ahh its 1");
	}
}
}