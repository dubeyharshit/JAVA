
public class Recurse {
public static void main(String[] args)
		{
	Recurse a = new Recurse();
	int g = a.fact1(1);
	System.out.println(g);
		}
public int fact1(int a)
{
	if(a ==1)
	{
		return 1;
	}
	int b =  fact1(a-1) * a;
	return b;
}
}
