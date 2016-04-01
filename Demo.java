	
//Use of the String toString: whenever you require to explore the constructor called value in the String form, you can simply use String toString... for an example...

//package pack1;

import java.util.*;

class Bank1 {

    String n;
    String add;
    int an;
    int bal;
    int dep;

    public Bank1(String n, String add, int an, int bal) {

        this.add = add;
        this.bal = bal;
        this.an = an;
        this.n = n;

    }

    public String toString() {
        return "Name of the customer.:" + this.n + ",, "
                + "Address of the customer.:" + this.add + ",, " + "A/c no..:"
                + this.an + ",, " + "Balance in A/c..:" + this.bal;
    }
}

public class Demo {

    public static void main(String[] args) {

        List<Bank1> l = new LinkedList<Bank1>();

        Bank1 b1 = new Bank1("naseem1", "Darbhanga,bihar", 123, 1000);
        Bank1 b2 = new Bank1("naseem2", "patna,bihar", 124, 1500);
        Bank1 b3 = new Bank1("naseem3", "madhubani,bihar", 125, 1600);
        Bank1 b4 = new Bank1("naseem4", "samastipur,bihar", 126, 1700);
        Bank1 b5 = new Bank1("naseem5", "muzafferpur,bihar", 127, 1800);
        l.add(b1);
        l.add(b2);
        l.add(b3);
        l.add(b4);
        l.add(b5);
        Iterator<Bank1> i = l.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}