import java.util.Scanner;

public class demosorted {
    public static boolean issorted(int arr[],int idx)
    {
        if (idx == arr.length-1) {
            return true;            
        }
        if (arr[idx]<arr[idx+1]) {
            return issorted(arr, idx+1);
        }
        else{
            return false;
        }
    }



    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter arr["+i+"] element:");
            arr[i]=sc.nextInt();
        }
        System.out.println(issorted(arr, 0));
    }
}
