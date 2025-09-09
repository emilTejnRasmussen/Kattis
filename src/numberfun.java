import java.util.Scanner;

public class numberfun
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++)
        {
            isPossible(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
    }

    private static void isPossible(int a, int b, int c)
    {
        String possible = "Impossible";
        if (a + b == c)
        {
            possible = "Possible";
        } else if (a - b == c || b - a == c)
        {
            possible = "Possible";
        } else if (a * b == c)
        {
            possible = "Possible";
        } else if (((double) a / b == c) || ((double) b / a == c))
        {
            possible = "Possible";
        }
        System.out.println(possible);
    }
}
