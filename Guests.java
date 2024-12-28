public class Guests {
    public static int callguest(int n)
        {
            if (n<=1) {
                return 1;
            }
            int ways1 = callguest(n-1);

            int ways2 = (n-1)*callguest(n-2);

            return ways1+ways2;
                }
    public static void main(String[] args) {
        System.out.println(callguest(4));
    }
}
