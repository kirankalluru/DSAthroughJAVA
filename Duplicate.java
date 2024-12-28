public class Duplicate {

    public static boolean[] map = new boolean[26];
    public static void removeduplicates(String str,int idx,String newString)
    {
        if (idx==str.length()) {
            System.out.println(newString);
            return;            
        }
        char current = str.charAt(idx);
        if (map[current-'a']) {
            removeduplicates(str, idx+1, newString);
        }
        else{
            newString+=current;
            map[current-'a']=true;
            removeduplicates(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "aabbccddee";
        removeduplicates(str, 0, "");
    }
}
