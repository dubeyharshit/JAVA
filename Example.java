

class Top {
public Top(String s) { System.out.print("B"); }
public Top()
{};
}
public class Example extends Top {
public Example(String s) {
	System.out.print("D"); }
public static void main(String [] args) {
new Example("C");
System.out.println(" ");
} }