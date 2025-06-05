import java.util.LinkedList;

public class LinkedlistExample {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add("apple");
        ll.add("banana");
        ll.add("cherry");
        ll.contains(45);
        System.out.println("Original list: " + ll);
        ll.removeFirst();
        System.out.println("Removed element: " + removed);

        System.out.println("List after removing first element: " + ll);
    }
}
