import java.util.HashMap;

public class Hashmappractice {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] arr = {16,5,7,8,9,3,7,8,16};
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
        int max =0;
        int maxfreq = arr[0];
        for(int val:hm.keySet())
        {
            // System.out.println(val+" "+hm.get(val));
            if (hm.get(val)) {
                
            }

        }

    }
}
