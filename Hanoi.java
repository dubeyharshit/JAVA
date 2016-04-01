
public class Hanoi {

public static void main(String[] args)
{		
	  String a="A",b="B",c="C";
		Hanoi m = new Hanoi();
		m.recurse(3,a,b,c);		
}
public void recurse(int z,String start,String help,String end)
{
	//System.out.println(z);
	System.out.println("\n+++++++++++++++++ starting for z:"+z);
	if (z ==1)
	{
		System.out.println(start+"-->"+end);
		System.out.println("\n+++++++++++++++++ ending for z:"+z);
		return;
	}
	recurse(z-1,start,end,help);
	System.out.println(start+"-->"+end);
	recurse(z-1,help,start,end);
	
	System.out.println("\n+++++++++++++++++ ending for z:"+z);
}
}
