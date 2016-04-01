import java.util.*;
class SearchObjArray {
public static void main(String [] args) {
String [] sa = {"one", "two", "three", "four"};
Arrays.sort(sa); // #1
for(String s : sa)
System.out.print(s + " ");
System.out.println("\none = "
+ Arrays.binarySearch(sa,"one")); // #2
System.out.println("now reverse sort");
ReSortComparator rs = new ReSortComparator(); // #3
Arrays.sort(sa,rs);
for(String s : sa)
System.out.print(s + " ");
System.out.println("\none = "
+ Arrays.binarySearch(sa,"one")); // #4
System.out.println("one = "
+ Arrays.binarySearch(sa,"one",rs)); // #5
}
static class ReSortComparator
implements Comparator<String> { // #6
public int compare(String a, String b) {
	System.out.println("s1:"+a+" ,s2:"+b);
	System.out.println("Return value:"+b.compareTo(a));
	System.out.println("Default return value:"+a.compareTo(b));
	return b.compareTo(a); // #7
}
}
}
//Sorting Collections and Arrays (Exam Objectives 6.3 and 6.5) 577