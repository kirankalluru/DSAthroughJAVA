import java.util.ArrayList;
import java.util.Collection;


public class ArraylistExample {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(5);
        arr.add(1);
        arr.add(22);
        arr.add(33);
        arr.add(44);
        arr.add(5);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        // Collections.sort(arr);
        System.out.println(arr.isEmpty());
    }
}