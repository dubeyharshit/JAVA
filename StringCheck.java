import java.util.*;
import java.lang.*;
import java.io.*;

public class StringCheck
{
	public static void check (String s1, String s2)
	{
		
		
		String[] v1 = s1.split("\\.");
		String[] v2 = s2.split("\\.");
		int i=0;
		int j=0;
		while(i<=v1.length-1 && j<=v2.length)
		{
			
			int s = Integer.valueOf(v1[i]);
			int r = Integer.valueOf(v1[i]);
			if(Integer.valueOf(v1[i]) < Integer.valueOf(v2[j]))
			{
				System.out.println("the 2nd one is greater");
				return;
			}
			else if(Integer.valueOf(v1[i]) > Integer.valueOf(v2[j]))
			{
				System.out.println("the 1st one is greater");
				return;
			}
			else
			{
				i++;
				j++;
			}
		}
		System.out.println("they are equal");
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		String a = "12.23.14";
		String b=  "12.23.14";

		check(a,b);
	}
		
	
}