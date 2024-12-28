import java.util.HashSet;


/**
 * tempCodeRunnerFile
 */
public class tempCodeRunnerFile {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        int[] arr = {1,1,2,2,4};
        for (int n:arr) {
            if(hs.contains(n))
            {
                System.out.println(n +" "+ (n+1));
            }
            else{
                hs.add(n);
            }
            
        }

        


    }
}