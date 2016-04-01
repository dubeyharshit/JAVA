
public class Label {
public static void main (String[] args)
{
int age = 0;
outer:
	while(age<21)
	{
		age++;
		if (age == 16)
		{
			System.out.println(age + "  get license");
			continue outer;
		}
		
		System.out.println("another year");
	}
}
}
