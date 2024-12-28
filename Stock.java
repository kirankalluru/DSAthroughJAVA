
public class Stock {

    // Time Complexity ==> O(n)
    public static void main(String[] args) {
        int stock_price[] = {7,3,4,5,6};
        int profit = 0;
        int low = stock_price[0];
        for (int i = 0; i < stock_price.length; i++) {
            int temp = stock_price[i] - low;
            profit = Math.max(profit, temp);
            low = Math.min(stock_price[i], low);
        }
        System.out.println(profit);
    }
}

