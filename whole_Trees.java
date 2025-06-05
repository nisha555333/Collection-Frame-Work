import java.util.TreeSet;
import java.util.NavigableSet;
class whole_Trees {
    public static void main(String[] args) {
        // Creating a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements to the TreeSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);

        // Displaying the TreeSet
        System.out.println("TreeSet: " + numbers);

        // ceiling(): Least element >= given element
        System.out.println("ceiling(55): " + numbers.ceiling(55)); // Output: 60

        // floor(): Greatest element <= given element
        System.out.println("floor(55): " + numbers.floor(55)); // Output: 50

        // higher(): Least element > given element
        System.out.println("higher(60): " + numbers.higher(60)); // Output: 70

        // lower(): Greatest element < given element
        System.out.println("lower(60): " + numbers.lower(60)); // Output: 50

        // first(): Retrieves the first (lowest) element
        System.out.println("first(): " + numbers.first()); // Output: 10

        // last(): Retrieves the last (highest) element
        System.out.println("last(): " + numbers.last()); // Output: 100

        // pollFirst(): Retrieves and removes the first element
        System.out.println("pollFirst(): " + numbers.pollFirst()); // Output: 10

        // pollLast(): Retrieves and removes the last element
        System.out.println("pollLast(): " + numbers.pollLast()); // Output: 100

        // Displaying the TreeSet after polling
        System.out.println("TreeSet after polling: " + numbers);

        // subSet(): Returns a view of the portion of this set between fromElement, inclusive, and toElement, exclusive
        NavigableSet<Integer> subSet = numbers.subSet(30, true, 70, false);
        System.out.println("subSet(30, true, 70, false): " + subSet); // Output: [30, 40, 50, 60]

        // headSet(): Returns a view of the portion of this set whose elements are strictly less than toElement
        NavigableSet<Integer> headSet = numbers.headSet(50, false);
        System.out.println("headSet(50, false): " + headSet); // Output: [20, 30, 40]

        // tailSet(): Returns a view of the portion of this set whose elements are greater than or equal to fromElement
        NavigableSet<Integer> tailSet = numbers.tailSet(60, true);
        System.out.println("tailSet(60, true): " + tailSet); // Output: [60, 70, 80, 90]
    }
}


