import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class fairytale
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++)
        {
            int noteAmount = sc.nextInt();
            Map<Integer, Boolean> accompaniments = new HashMap<>(Map.of(
                    10, false,
                    20, false,
                    30, false,
                    40, false
            ));

            int strings = 0;

            for (int j = 0; j < noteAmount; j++)
            {
                int note = sc.nextInt();
                if (note <= 10 && !accompaniments.get(10)) {
                    strings++;
                    accompaniments.put(10, true);
                }
                else if (10 < note && note <= 20 && !accompaniments.get(20)) {
                    strings++;
                    accompaniments.put(20, true);
                }
                else if (20 < note && note <= 30 && !accompaniments.get(30)) {
                    strings++;
                    accompaniments.put(30, true);
                }
                else if (30 < note && note <= 40 && !accompaniments.get(40)) {
                    strings++;
                    accompaniments.put(40, true);
                }
            }

            System.out.println(strings);
        }
    }
}
