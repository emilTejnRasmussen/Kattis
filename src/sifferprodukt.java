import java.util.Scanner;

public class sifferprodukt
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x >= 10)
        {
            int product = 1;

            while (x > 0)
            {
                int digit = x % 10;
                if (digit != 0)
                {
                    product *= digit;
                }
                x /= 10;
            }
            x = product;
        }
        System.out.println(x);
    }
}
