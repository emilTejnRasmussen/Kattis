import java.util.Scanner;

public class zamka
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), d = sc.nextInt(), s = sc.nextInt();
        int minNumber = 0, maxNumber = 0;
        //Find minimal
        for (int i = m; i <= d; i++)
        {
            if (sumDigits(i) == s)
            {
                minNumber = i;
                break;
            }
        }
        //Find maximal
        for (int i = d; i >= m; i--)
        {
            if (sumDigits(i) == s)
            {
                maxNumber = i;
                break;
            }
        }

        System.out.println(minNumber);
        System.out.println(maxNumber);
    }

    private static int sumDigits(int n)
    {
        int sum = 0;
        while (n > 0)
        {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
