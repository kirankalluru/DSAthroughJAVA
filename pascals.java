import java.util.ArrayList;
import java.util.Scanner;

public class pascals {
    public static int factorial(int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> twod = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();

        // Building Pascal's triangle
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> oned = new ArrayList<>();

            // Print spaces for formatting
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // Calculate and print elements of Pascal's triangle
            for (int k = 0; k <= i; k++) {
                int ans = factorial(i) / (factorial(i - k) * factorial(k));
                oned.add(ans);
                System.out.print(ans + " ");
            }

            twod.add(oned); // Add the current row to the 2D array
            System.out.println(); // New line for the next row
        }

        // Print the 2D list representation of Pascal's Triangle
        System.out.println(twod);
        sc.close();
    }
}

// output

// Enter the number of rows:
// 5
//      1 
//     1 1 
//    1 2 1 
//   1 3 3 1
//  1 4 6 4 1
// [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]


