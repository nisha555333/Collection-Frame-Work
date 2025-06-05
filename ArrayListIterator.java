import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Apple");
        al.add("orange");
        al.add("cake");
        ListIterator ls = al.listIterator();
        while (ls.hasNext()) {
            System.out.println(ls.next());   
        }
    }
}
