import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class freefood
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Set<Integer> days = new HashSet<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int j = a-1; j < b ; j++)
            {
                days.add(j);
            }
        }
        System.out.println(days.size());
    }
}
