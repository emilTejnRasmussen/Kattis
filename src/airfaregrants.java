import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class airfaregrants
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> prices = new ArrayList<>();


        for (int i = 0; i < n; i++)
        {
            prices.add(sc.nextInt());
        }

        int low =prices.getFirst(), high =prices.getFirst();

        for (int price : prices) {
            if (price < low){
                low = price;
            } else if (high < price) {
                high = price;
            }
        }
        int res = low - (high/2);
        if (res<0){
            System.out.println(0);
        } else {
            System.out.println(res);
        }
    }
}
