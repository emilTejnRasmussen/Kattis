import java.util.Scanner;

public class thestockmarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfDays = sc.nextInt();
        int simmerTime = sc.nextInt();
        int[] prices = new int[numOfDays];

        int bestPrice = Integer.MIN_VALUE;

        for (int i = 0; i < numOfDays; i++) {
            prices[i] = sc.nextInt();
        }

        for (int i = 0; i < numOfDays-simmerTime; i++) {
            int profit = prices[i + simmerTime] - prices[i];
            if (profit > bestPrice) bestPrice = profit;
        }
        System.out.println(bestPrice);
    }
}
