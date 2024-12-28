import java.util.HashMap;

public class Hashmappractice2 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        String[] arr = {"hello","kiran","hello","kiran","kalluru"};
        for (String n:arr) {
        if (hm.containsKey(n)) {
            hm.put(n, hm.get(n)+1);
        }
        else{
            hm.put(n, 1);
        }

        // simplified format of writing above if else

        // hm.put(n, hm.getOrDefault(n, 0)+1);
        
        }

        for(String n:hm.keySet())
        {
            System.out.println(n+"  "+hm.get(n));
        }
    }
}
