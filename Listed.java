import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listed {
	
public static void main(String[] args)
{
	
List<Integer> a = new ArrayList<Integer>();
a.add(123);
a.add(345);
a.add(888);
}
}
class Bar {
void doInsert(List<Object> list) {
list.add(new Listed());
}
}


