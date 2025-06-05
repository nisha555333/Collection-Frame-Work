import java.util.HashSet;
public class Hasheset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(20);
        hs.add(30);
        hs.add(20); 
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains(20));
        System.out.println("hashset "+hs);
        for(Integer elemnets:hs){
           System.out.println(elemnets);
        }
        
    }   
}
