public class Substring {


    public static void main(String[] args) {
        String s = "KIRAN";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(s.charAt(k)+" ");
                }
                System.out.println();
            }
            
            
        }
    }
}

