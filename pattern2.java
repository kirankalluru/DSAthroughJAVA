import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        int i,k,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for (k = 1; k <= i; k++) {
                if ((i+k)%2==0) {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}



// output:
// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1