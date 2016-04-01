
public class StringCompare {
public static void main(String[] args)
{
String a = "";
String b = "";

String[] c = a.split("\\.");
String[] d = b.split("\\.");
System.out.println(d[0]);

int i;
for(i=0;i<c.length;i++)
{
if(c[i]== null && d[i] == null)
{
	System.out.println("Cannot Compare");
}
else if (c[i]==null)
{
	System.out.println("b is bigger");
}
else if (d[i]==null)
{
	System.out.println("a is bigger");
}
}
}
}

