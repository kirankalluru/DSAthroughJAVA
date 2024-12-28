package SlidingWindow;

import java.util.Scanner;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int sl;
        System.out.print("Enter Maximum subarray sum of size: ");
        Scanner sc = new Scanner(System.in);
        sl = sc.nextInt();
        int arr[] = {5,8,8,3,5};
        int ans = 0;
        int l = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
            if (i-l == sl-1) {
                ans = Math.max(ans, temp);   

                //slide the window by removing left most element 
                temp -= arr[l];
                l += 1;
            }

        }
        System.out.println("max of Sum of Subarray length "+sl+" is "+ans);
    }
    
}
// Output step by step: int arr[] = {5,8,8,3,5};
// Initial values: ans = 0, l = 0, temp = 0

// i = 0
// temp = 5

// i = 1
// temp = 13

// i = 2
// temp = 21
// i - l == 2, so ans = Math.max(0, 21) = 21
// Slide the window: temp = 21 - 5 = 16, l = 1

// i = 3
// temp = 19
// i - l == 2, so ans = Math.max(21, 19) = 21
// Slide the window: temp = 19 - 8 = 11, l = 2

// i = 4
// temp = 16
// i - l == 2, so ans = Math.max(21, 16) = 21
// Slide the window: temp = 16 - 8 = 8, l = 3

// Final output: 21