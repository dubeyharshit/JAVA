
public class Switch {


public static void main(String[] args)
{
	outer:
		for (int i=0; i<5; i++) {
		for (int j=0; j<5; j++) {
		System.out.println("Hello");
		break outer;
		} // end of inner loop
		System.out.println("outer"); // Never prints
		}
		System.out.println("Good-Bye");
}
}

