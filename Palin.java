public class Palin {

	public static void main (String[] args)
	{
		int[] array1  = {3,5,7};
		Palin s = new Palin();
		s.multiply(array1);		
	}
	public int[] multiply(int[] a)
	 {
		int multiplyResult = 1;
		int[] b = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			multiplyResult *= a[i];
			// System.out.println(sum);
		}
		for (int i=0;i<a.length;i++)
		{ 
			b[i] = (multiplyResult/a[i]);
			System.out.print(b[i] + " ");
		}
		 return b ;
	 }
}
