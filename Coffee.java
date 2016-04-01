class Coffee1 {
	enum coffeesize {BIG,SMALL,MEDIUM};
	coffeesize size;
}
//enum coffeesize {BIG,SMALL,MEDIUM};
public class Coffee
{
public static void main (String[] args)
{
Coffee1 c = new Coffee1();
c.size = Coffee1.coffeesize.BIG;
System.out.println(c.size);

}
}