/**
 * Lcm
 */
public class Lcm {
    public static void main(String[] args) {
        
        int a=3;
        int b=4;
        if(a>b)
        {
            a=a+b;
            b=a-b;
            a=a-b;
        }
        for(int i=1;i<=a;i++)
        {
            if ((b*i)%a==0) {
                System.out.println(b*i);
                break;
            }
        }
    }
    
}