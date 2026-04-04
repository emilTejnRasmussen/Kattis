import java.util.Scanner;

public class generalizedfizzbuzz
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();

        System.out.println(fizzBuzz(n, a, b));
    }

    private static String fizzBuzz(int n, int a, int b)
    {
        int fizzCount = 0, buzzCount = 0, fizzBuzzCount = 0;

        for (int i = 1; i <= n; i++)
        {
            if (i % a == 0 && i % b == 0) fizzBuzzCount++;
            else if (i % a == 0) fizzCount++;
            else if (i % b == 0) buzzCount++;
        }

        return String.format("%d %d %d", fizzCount, buzzCount, fizzBuzzCount);
    }
}
