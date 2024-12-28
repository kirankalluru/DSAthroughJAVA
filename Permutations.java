public class Permutations {
    public static void permutationstr(String str,String permutations)
    {
        
        if (str.length()==0) {
            System.out.println(permutations);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentchar = str.charAt(i);
            String newstr = str.substring(0, i)+str.substring(i+1);
            permutationstr(newstr, permutations+currentchar);
            
        }
    }
    public static void main(String[] args) {
        String str="abcdefghi";
        permutationstr(str, "");
    }
}
