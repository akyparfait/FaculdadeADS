public class Endereçovariavel {
        public static void main(String[] args) {
            int numInt = 10;
            float numFloat = 10.5f;
            double numDouble = 20.5;
    
            System.out.println("Endereço aproximado do int: " + System.identityHashCode(numInt));
            System.out.println("Endereço aproximado do float: " + System.identityHashCode(numFloat));
            System.out.println("Endereço aproximado do double: " + System.identityHashCode(numDouble));
        }
    }
    
    
