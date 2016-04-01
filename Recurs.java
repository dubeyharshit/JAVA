
public class Recurs {
	
public static void main(String[] args)
{
	int n = 5;
	Recurs g = new Recurs();
	int c = g.rec(n);
	System.out.println(c);
	
}
public int rec(int v)
{
	if(v==1)
	{
		return 1;
	}
	return v * rec(v-1);
}
}
