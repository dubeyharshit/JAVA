public class Fibonacci1
{ 
public static void main( String [] args) 
{ 
int a = 0; 
int b = 1; 
System.out.print(" " + a +" "); 
System.out.print(" " + b +" "); 
for (int i=0;i <=10; i++) 
{ 
int c = a+b; 
System.out.print(" " + c +" "); 
b=c; 
a=b-a; 
} 
} 
}