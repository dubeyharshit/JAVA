import java.util.TreeSet;
 
class Dog10 implements Comparable<Dog10> {
 
    int size;
 
    Dog10(int s) {
        size = s;
    }
 
    public int compareTo(Dog10 o) {
        return size - o.size;
    }
}
 
public class ImpComparable {
 
    public static void main(String[] args) {
 
        TreeSet<Dog10> d = new TreeSet<Dog10>();
        d.add(new Dog10(1));
        d.add(new Dog10(2));
        d.add(new Dog10(1));
 
        TreeSet<Integer> i = new TreeSet<Integer>();
        i.add(1);
        i.add(2);
        i.add(3);
 
        System.out.println(d.size() +" "+ i.size());
    }
}