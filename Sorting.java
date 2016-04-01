
public class Sorting {
	
public static void main(String[] args)
{
	int[] a = {1,2,3,4,5};
	Sorting sort = new Sorting();
	int g = sort.rec(a,a.length);
	System.out.println(g);
}
public int rec(int[]b,int v)
{
	if(v==1)
	return 1;
	return (b[v-1]<b[v-2])?0:rec(b,v-1);

}
}
