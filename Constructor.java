


public class Constructor {
int size;
String name;
Constructor(String name, int size) {
this.name = name;
this.size = size;
}
public static void main(String[] args)
{
	Constructor a = new Constructor("Harshit", 2);
	System.out.println(a.name + "  " + a.size);
}
}
