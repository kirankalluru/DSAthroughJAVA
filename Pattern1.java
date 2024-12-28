import java.util.Scanner;

/**
 * pattern1
 */
public class Pattern1 {
    public static void main(String[] args) {
        int i,j,k,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for (k = 1; k <= n-i; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
