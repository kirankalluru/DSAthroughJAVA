public class Max_distance {
    public static void main(String[] args) {
        
        int arr[] = {1,1,2,2,3,45};
        int l=0;
        int n=arr.length;
        int r = n-1;
        for(int i=0;i<n;i++)
        {
            if (arr[i]!=arr[n-1]) {
                r=i;
                break;
            }
        }
        for (int i = n-1; i > 0; i--) {
            if (arr[i] != arr[0]) {
                l=i;
                break;
            }
        }
        int rightans = n-1-r;
        int leftans = l;
        System.out.println(Math.max(rightans, leftans));
    }
    
    
}
