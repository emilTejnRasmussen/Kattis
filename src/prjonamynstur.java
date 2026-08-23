import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prjonamynstur
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();

        Map<Character, Integer> yarnInMillimeters = new HashMap<>(Map.of(
                '.', 20,
                'O', 10,
                '\\', 25,
                '/', 25,
                'A', 35,
                '^', 5,
                'v', 22
        ));

        int yarnSumAmount = 0;

        for (int i = 0; i < n; i++)
        {
            for (char symbol : sc.nextLine().toCharArray()) {
                yarnSumAmount += yarnInMillimeters.get(symbol);
            }
        }

        System.out.println(yarnSumAmount);
    }
}
