
public class ReverseS {
public static void main(String[] args)
{
	String s = "Harshit";
	/*StringBuffer b = new StringBuffer(s);
	System.out.println(b.reverse());*/
	char[] a = s.toCharArray();
	for(int i = a.length-1;i>=0;i--)
	{
		System.out.print(a[i]);
	}
}
}
