public class Reverse {
public static void main(String[] args)
{
String a = "10.1.1.2";
String b = "10.1.1.2";

String[] c = a.split("\\.");
String[] d = b.split("\\.");
int flag = 0;
abc:for (int i=0;i<c.length;i++)
{
	switch (c[i].compareTo(d[i]) )	 	
	{
		case 0:
			//System.out.println("Both are equal");
			break;
		case 1:
			flag =1;
			System.out.println("a is bigger");
			break abc;
		case -1:
			flag = 1;
			System.out.println("b is bigger");
			break abc;
		default:
			break;
	}
}
if(flag ==0)
	System.out.println("Both are equal");
}
}
