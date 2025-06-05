import java.util.*;

public class Comparator1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(new MyComparator());
        ts.add(10);
        ts.add(0);
        ts.add(20);
        ts.add(40);

        System.out.println("TreeSet: " + ts);
    }
}

class MyComparator implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) {
            return +1;
        } else if (o1 > o2) {
            return -1;
        } else {
            return 0;
        }
    }
}
