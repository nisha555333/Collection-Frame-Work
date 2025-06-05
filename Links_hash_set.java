import java.util.LinkedHashSet;
import java.util.Iterator;

public class Links_hash_set {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.contains("Cherry");
      LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<>();
      linkedHashSet2.add("orange");
      linkedHashSet2.add("pine apple");
      linkedHashSet2.add("strawberry");
      linkedHashSet2.contains("fruity");
      linkedHashSet.addAll( linkedHashSet2);
System.out.println("the entire set is: "+ linkedHashSet);
// iterator usage:
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
