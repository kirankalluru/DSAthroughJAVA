public class Totalpaths {
    
    public static int countpaths(int i,int j,int n,int m)
    {
        if (i==n-1 && j==m-1) {
            return 1;
        }
        if (i==n || j==m) {
            return 0;
        }
        //down paths
        int downpaths=countpaths(i+1, j, n, m);
        //rightpaths
        int rightpaths=countpaths(i, j+1, n, m);
        return downpaths+rightpaths;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        int count = countpaths(0, 0, n, m);
        System.out.println(count);
    }
}
