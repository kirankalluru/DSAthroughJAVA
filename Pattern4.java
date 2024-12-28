import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value:");
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// output:
//     *****
//    *****
//   *****
//  *****