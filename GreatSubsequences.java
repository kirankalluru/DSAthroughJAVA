import java.util.Scanner;

public class GreatSubsequences {

    private static final int MOD = 1000000007;
    
    // Function to calculate the number of great subsequences
    public static int countGreatSubsequences(int[] arr, int N, int maxVal) {
        int[] gcdCount = new int[maxVal + 1];
        
        // Calculate the count for each GCD
        for (int x : arr) {
            for (int div = 1; div * x <= maxVal; div++) {
                gcdCount[div * x]++;
            }
        }
        
        // Use inclusion-exclusion to calculate subsequences with GCD > 1
        long result = 0;
        for (int g = 2; g <= maxVal; g++) {
            if (gcdCount[g] > 0) {
                long subsequences = (power(2, gcdCount[g]) - 1 + MOD) % MOD; // Exclude empty subsequence
                result = (result + subsequences) % MOD;
            }
        }
        
        return (int) result;
    }
    
    // Helper function to calculate power mod MOD
    private static long power(long base, long exp) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }
    
    // Process the queries
    public static int processQueries(int[] arr, int[][] queries, int N) {
        int maxVal = 100000;
        long sumOfResults = 0;

        for (int[] query : queries) {
            int X = query[0] - 1;  // Convert to zero-indexed
            int Y = query[1];
            
            // Update the array with the new value
            arr[X] = Y;
            
            // Count great subsequences after the query
            int result = countGreatSubsequences(arr, N, maxVal);
            sumOfResults = (sumOfResults + result) % MOD;
        }
        
        return (int) sumOfResults;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the array size N
        int N = scanner.nextInt();
        int[] arr = new int[N];
        
        // Read the array elements
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Read the number of queries Q
        int Q = scanner.nextInt();
        int[][] queries = new int[Q][2];
        
        // Read the queries
        for (int i = 0; i < Q; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
        }
        
        // Process the queries and get the result
        int result = processQueries(arr, queries, N);
        
        // Print the result
        System.out.println(result);
        
        scanner.close();
    }
}
