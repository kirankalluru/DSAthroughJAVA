import java.util.ArrayList;

public class Subsequence {


        public static void main(String[] args) {
            ArrayList<String> al = new ArrayList<>();
            String s = "KIRAN";
            int n = s.length();
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    String temp = s.substring(i, j+1);
                    al.add(temp);
                }
                
                
            }
            System.out.println(al);
        }
    }
    
    
    // output

    // [K, KI, KIR, KIRA, KIRAN, I, IR, IRA, IRAN, R, RA, RAN, A, AN, N]
