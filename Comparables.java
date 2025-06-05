public class Comparables {
    public static void main(String[] args) {
        System.out.println("a".compareTo("z"));
        System.out.println("z".compareTo("x"));
        System.out.println("z".compareTo("z"));
        try{
        System.out.println("z".compareTo(null));
        }
        catch(NullPointerException np){
           System.out.println("null pointer exception");
        }
    }
}
