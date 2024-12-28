public class Anagram {
    
        public static void check(String str1,String str2)
        {
            int[] astr1= new int[26];
            int[] astr2= new int[26];
            if (str1.length() != str2.length()) {
                System.out.println("these  are not anagrams!!");
                return;
            }
            else{
                for (int i = 0; i < str1.length(); i++) {
                    astr1[str1.charAt(i)-'a']++;
                }
                
                for (int i = 0; i < str2.length(); i++) {
                    astr2[str2.charAt(i)-'a']++;
                }
                for (int i = 0; i < 26; i++) {
                    if (astr1[i]!=astr2[i]) {
                        System.out.println("these are not anagrams!!");
                        return;
                    }  
                }
                System.out.println("these are anagrams");
    
            }
    
        }
        public static void main(String[] args) {
           String str1 = "king";
           String str2 = "gnik";
           check(str1, str2);
        }
    }

