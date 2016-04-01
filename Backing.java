
public class Backing {
public static void main(String[] args)
{
	Backing a = new Backing();
	int b = a.fact(5);
	System.out.println(b);
}
public int fact (int n) {
    int result;
    if(n==1) return 1;
    result = fact(n-1) * n;
    System.out.println(result);
    return result;
    
}
}
