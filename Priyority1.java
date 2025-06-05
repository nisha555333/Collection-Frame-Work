import java.util.PriorityQueue;
public class Priyority1 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>();
        PriorityQueue<Object> pq1 = new PriorityQueue<>();
        pq.add("hari");
        pq.add("age");
        PriorityQueue pq2 = new PriorityQueue<>();
        pq2.add("tarun");
        PriorityQueue pq3 = new PriorityQueue<>();
        pq3.addAll(pq2);
        System.out.println("the elements present in 1st queue: "+pq);
        System.out.println("the elements present in 2nd queue: "+pq2);
}
}