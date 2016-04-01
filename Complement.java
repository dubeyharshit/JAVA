
public class Complement {
static String a = "0101";
public static void main(String[] args)
{
char b[] = new char[a.length()];
for (int i = 0; i<a.length();i++ )	
{
	
	if(a.charAt(i)=='0')
	{
	b[i] = '1';
	}
	else{
		b[i] = '0';
	}
}
for (char c: b)
System.out.print(c);
}
}