import java.util.HashMap;

public class Hashmappractice {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] arr = {1,2,3,1,2,3};
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];

            if (hm.containsKey(n)) {
                int prev = hm.get(n);
                hm.put(n, prev+1);
                
            }
            else{
                hm.put(n, 1);
            }
        }
        
        for(int val:hm.keySet())
        {
            System.out.println(val+" "+hm.get(val));
            

        }

    }
}
