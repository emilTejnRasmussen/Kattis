import java.util.Scanner;

public class easiest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n != 0)
        {
            int targetSum = getSumOfDigits(n);

            int m = 11;

            while (targetSum != getSumOfDigits(m * n))
            {
                m++;
            }

            System.out.println(m);

            n = sc.nextInt();
        }
    }

    private static int getSumOfDigits(int n)
    {
        int sum = 0;

        for (String num : (n + "").split(""))
        {
            sum += Integer.parseInt(num);
        }

        return sum;
    }
}
