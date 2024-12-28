import java.util.ArrayList;

public class Subset {
    public static void printsubset(ArrayList<Integer> subset)
    {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
            
        }
        System.out.println();
    }
    public static void findsub(int n,ArrayList<Integer> subset)
    {
        if (n==0) {
            printsubset(subset);
            return;
        }
        //add
        subset.add(n);
        findsub(n-1, subset);

        //dont add
        subset.remove(subset.size()-1);
        findsub(n-1, subset);
    }
    public static void main(String[] args) {
        ArrayList<Integer> Alist = new ArrayList<>();
        findsub(3, Alist);
    }
}
