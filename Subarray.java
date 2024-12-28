/**
 * Subarray
 */
public class Subarray {

    public static void main(String[] args) {
        int[] arr = {1,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("[");
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.print("]");
                System.out.println();
            }
        }
    }
}

// output

// [1 ]
// [1 3 ]
// [1 3 4 ]
// [1 3 4 5 ]
// [3 ]
// [3 4 ]
// [3 4 5 ]
// [4 ]
// [4 5 ]
// [5 ]