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

// output

// K 
// K I 
// K I R 
// K I R A 
// K I R A N 
// I 
// I R 
// I R A 
// I R A N 
// R 
// R A 
// R A N 
// A 
// A N 
// N 


