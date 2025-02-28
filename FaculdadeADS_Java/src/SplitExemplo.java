public class SplitExemplo {
    public static void main(String[] args) {
        
        String s = "potato apple lemon orange";

        String[] vect = s.split(" "); 

        System.out.println(vect[0]); // potato
        System.out.println(vect[1]); // apple
        System.out.println(vect[2]); // lemon
        System.out.println(vect[3]); // lemon
        
    }
}
