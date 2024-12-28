
public class sumof_Subsequence_slidingWindow {
    public static void main(String[] args) {
        int arr[] = {5,8,8,3,5};
        int ans = 0;
        int l = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
            if (i-l == 2) {
                ans = Math.max(ans, temp);   

                //slide the window by removing left most element 
                temp -= arr[l];
                l += 1;
            }

        }
        System.out.println(ans);
    }
}

