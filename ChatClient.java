import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChatClient
{
public static void main(String[] args)
{
	Scanner b = new Scanner(System.in);
	
	int count = 0;
	String s = "How r u How";
	Pattern m = Pattern.compile("How");
	Matcher n = m.matcher(s);
	while(n.find())
	{
		count++;
	}
	System.out.println(count);
	List list = new ArrayList();
	list.add("233");
	list.add("234");

	Iterator iterator = list.iterator();
	while(iterator.hasNext())
	{
		Object chatter = iterator.next();
		System.out.println(chatter);
	}

}

/*public static void Collection (Collection collection)
{
	
}
*/

}