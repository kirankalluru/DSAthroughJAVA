public class demo {
    
        public static void main(String[] args) {
            int last=-1,first=-1;
            String name = "kiran kalluru";
            for (int i = 0; i < name.length(); i++) {
                if (first==-1 && name.charAt(i)=='e') {
                    first = i;
                    
                }
                else{
                    if (name.charAt(i)=='e') {
                        last=i;
                        
                    }
                }
            }
            System.out.println("first:"+first);
            System.out.println("last:"+last);
        }

        
    }

