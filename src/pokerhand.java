import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pokerhand
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        List<String> ranks = new ArrayList<>();
        String[] cards = sc.nextLine().split("");
        for (int i = 0; i < cards.length; i++)
        {
            if (i % 3 == 0)
            {
                ranks.add(cards[i]);
            }
        }
        int result = 0;

        for (String rank : ranks)
        {
            int sum = 0;
            for (String s : ranks)
            {

                if (rank.equals(s))
                {
                    sum++;
                }
            }
            if (result < sum)
            {
                result = sum;
            }
            sum = 0;
        }
        System.out.println(result);
    }
}
