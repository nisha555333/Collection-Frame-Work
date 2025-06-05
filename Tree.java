import java.util.TreeSet;
public class Tree {
    public static void main(String args []){
       TreeSet ts = new TreeSet<>();
       ts.add(10);
       ts.add(50);
       ts.add(75);
       System.out.println(ts.ceiling(25)); 
       System.out.println(ts.floor(30));
       System.out.println(ts.higher(75));
       System.out.println(ts.lower(30));

    }
    
}
