public class array {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},{5,1,2,3},{9,5,8,2}};
        int r = arr.length;
        int c = arr[0].length;
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if ((i!=0 && j!=0)&&(arr[i][j] != arr[i-1][j-1])) {
                    System.out.println("shitt");
                    return;
                }
            }
                
            }
            System.out.println("yess");
        }
    }

