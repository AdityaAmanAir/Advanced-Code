/// Incremental Sieve
import java.util.HashMap;

public class class8a {

    HashMap<Integer, Integer> map = new HashMap<>();
    int current =2;

    public int Nextprime(){
        while(true){
            Integer nextComp = map.get(current);
            if(nextComp == null){
                int prime =current;
                map.put(prime*prime, prime);

                current++;
                return prime;
            }else{
                int prime = nextComp;
                int next = current +prime;

                while(map.containsKey(next)){
                    next+=prime;
                }
                map.remove(current);
                map.put(next, prime);

                current++;
            }
        }
    }
    public static void main(String args[]){

        class8a gen = new class8a();

        System.out.println("20th : ");
        for (int i =0;i<20;i++){
            System.out.print(gen.Nextprime()+" ");
        }
        System.out.println("\n.\nLoading..");
        for (int i =0; i<10;i++){
            System.out.print(gen.Nextprime()+" ");
        }
    }
}
