import java.util.*;

public class class7b {
    
    HashMap<Integer, Integer> map = new HashMap<>();
    int current = 2;
    public int nextPrime() {
        while (true) {
            Integer nextComposite = map.get(current);
            if (nextComposite == null) {
                int prime = current;
                map.put(prime * prime, prime);
                
                current++;
                return prime;
            } else {
                int prime = nextComposite;
                int next = current + prime;
                
                while (map.containsKey(next)) {
                    next += prime;
                }
                
                map.remove(current);
                map.put(next, prime);
                
                current++;
            }
        }
    }
    
    public static void main(String args[]) {
        class7b generator = new class7b();
   
        System.out.println("First 20 prime numbers:");
        for (int i = 0; i < 20; i++) {
            System.out.print(generator.nextPrime() + " ");
        }
        
        System.out.println("\n\nGenerating more primes...");

        for (int i = 0; i < 10; i++) {
            System.out.print(generator.nextPrime() + " ");
        }
    }
}