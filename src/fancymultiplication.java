import java.math.BigInteger;
import java.util.Scanner;

public class fancymultiplication
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = sc.nextLong();
        BigInteger sum = BigInteger.ZERO;

        for (int i = 0; i < a; i++)
        {
            sum = sum.add(BigInteger.valueOf(b));
        }

        System.out.println(sum);
    }
}
