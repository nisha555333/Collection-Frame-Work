import java.util.*;
public class Comaparator2_Strings {
    public static void main(String[] args) {
      TreeSet<String> ts = new TreeSet<>(new MyComparator1());
      ts.add("suresh");
      ts.add("naresh");
      ts.add("ganesh");
      ts.add("rajesh");
      
      System.out.println("treeset: "+ts);
    }
    }
    class MyComparator1 implements Comparator<String>{
        public int compare(String o1,String o2){
          
          return(o1).compareTo(o2);   
    }
  } 

