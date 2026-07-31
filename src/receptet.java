import java.util.Scanner;

public class receptet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ingredientAmount = sc.nextInt();
        int total = 0;

        for (int i = 0; i < ingredientAmount; i++) {
            int owned = sc.nextInt();
            int needed = sc.nextInt();
            int difference = needed - owned;
            int cost = sc.nextInt();

            if (difference > 0) {
                total += difference * cost;
            }
        }

        System.out.println(total);
    }
}
