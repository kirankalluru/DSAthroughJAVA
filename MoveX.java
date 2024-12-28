public class MoveX {
 public static void main(String[] args) {
    String name = "axbxcxd";
    String newname = "";
    int count = 0;
    for (int i = 0; i < name.length(); i++) {
        if (name.charAt(i)!='x') {
            newname=newname+name.charAt(i);
            
        }
        else{
            count+=1;
        }
    }
    newname +="x".repeat(count);
    System.out.println(newname);
 }   
}
