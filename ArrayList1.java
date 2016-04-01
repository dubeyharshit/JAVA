import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
public static void main(String[] args)
{
List list = new ArrayList();
list.add("123");
list.add("234");
System.out.println(list.get(0));
String a = (String) list.get(1);
//System.out.println(list.get(0));
list.remove(1);
System.out.println(list.get(1));
}
}
