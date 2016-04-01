public class StringSum {

	public static void main (String[] args)
	{
		int[] array1  = {1,3,5,6,7,8,9};
		StringSum s = new StringSum();
		s.sum(array1);		
	}
	public int[] sum(int[] a)
	 {
		int sum = 0;
		int[] b = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			sum += a[i];
			// System.out.println(sum);
		}
		for (int i=0;i<a.length;i++)
		{ 
			b[i] = sum - a[i];
			System.out.print(b[i] + " ");
		}
		 return b ;
	 }
}
